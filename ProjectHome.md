&lt;wiki:gadget url="http://www.ohloh.net/p/20770/widgets/project\_users\_logo.xml" height="43" border="0"/&gt;

**Announcement:** The repository migrated to github https://github.com/uudashr/jsmpp, feel free to fork for enhancement

JSMPP is a java implementation (SMPP API) of SMPP protocol (currently support SMPP v3.4). It provides interfaces to communicate with Message Center or ESME (External Short Message Entity) and able to handle traffic 3000-5000 messages per second.

SMPP is stand for Short Message Peer to Peer. It is a standard protocol for exchanging SMS messages between SMS entities over TCP/IP or X.25 connections.

This API created to reduce the verbosity of the existing SMPP API. It's very simple and easy to use because it hides the complexity of the low level protocol communication such as automatically _enquire link_ request-response.

Examples provided on source distribution.
Examples:
  * [Simple Submit Short Message](http://code.google.com/p/jsmpp/source/browse/trunk/src/java/examples/org/jsmpp/examples/SimpleSubmitExample.java)
  * [Submit Short Message and Request for Delivery Receipt](http://code.google.com/p/jsmpp/source/browse/trunk/src/java/examples/org/jsmpp/examples/SimpleSubmitRegisteredExample.java) & [MessageListener](http://code.google.com/p/jsmpp/source/browse/trunk/src/java/examples/org/jsmpp/examples/MessageReceiverListenerImpl.java)
  * [Receive Submit Short Message](http://code.google.com/p/jsmpp/source/browse/trunk/src/java/examples/org/jsmpp/examples/ReceiveSubmittedMessageExample.java)

Contribution are pleased. Send me some feedback, request of feature, idea or patch related to JSMPP in order to improve performance, more reliable and easy to use.

If there is any question, please contact me (project owner uudashr@gmail.com) or go to our mailing list http://groups.google.com/group/jsmpp, since the documentation is not finish yet.

Links:
  * [SMPP Forum](http://smsforum.net/)
  * SMPP V3.4 Specification http://smsforum.net/SMPP_v3_4_Issue1_2.zip
  * [SMPP SMSC Simulator](http://www.seleniumsoftware.com/downloads.html)

Other SMPP API:
  * [SMPP API](http://smppapi.sourceforge.net/)
  * [Open SMPP by Logica](http://opensmpp.logica.com/introhtml/menu.htm)

Projects use jsmpp:
  * [Apache ServiceMix, SMPP Component](http://servicemix.apache.org/servicemix-smpp.html)
  * [SMSLib](http://smslib.org) (http://smslib.org & http://code.google.com/p/smslib)