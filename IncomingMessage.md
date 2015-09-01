# Introduction #

Incoming Message transfered via command known as DELIVER\_SM.
DELIVER\_SM can be an ordinary message or it's a delivery receipt of previously submitted message.


# Sample Source #
```
private static final PDUDecomposer smppDecomposer = new DefaultDecomposer();

...

public class MessageReceiverListenerImpl implements MessageReceiverListener {
	public void onAcceptDeliverSm(DeliverSm deliverSm) throws ProcessMessageException {
		if (deliverSm.isSmscDeliveryReceipt()) {
			// this is delivery receipt
			try {
				DeliveryReceipt delReceipt = smppDecomposer.deliveryReceipt(deliverSm.getShortMessage());
				try {
					long id = Long.parseLong(delReceipt.getId()) & 0xffffffff;
					String messageId = Long.toString(id, 16).toUpperCase();
					
					try {
						// update the delivery status
						submitDao.updateDeliveryStatus(messageId, delReceipt.getFinalStatus());
					} catch (SubmitItemNotFoundException e) {
						throw new ProcessMessageException("Rejecting delivery receipt since message_id not found", SMPPConstant.STAT_ESME_RINVDFTMSGID);
					}
				} catch (NumberFormatException e) {
					throw new ProcessMessageException("Rejecting delivery receipt since id parameter is not an integer", SMPPConstant.STAT_ESME_RINVMSGID, e);
				}
				
				
			} catch (InvalidDeliveryReceiptException e) {
				throw new ProcessMessageException("Rejecting delivery receipt since error parse found", SMPPConstant.STAT_ESME_RINVDFTMSGID);
			}
		} else {
			// this is ordinary message, add to database
			deliverDao.create(deliverSm);
		}
	}
}
```