Getting started with JSMPP Library


## Prerequisite ##

  * Download the latest release from Downloads section
  * JDK 1.5 installed on your system

## Running SMPP Server ##
Set following jars in classpath (shipped with download)
  * jsmpp-2.0.1.jar
  * jsmpp-examples.jar
  * slf4j-api-1.4.3.jar
  * slf4j-log4j12-1.4.3.jar
  * log4j-1.2.14.jar

On a Console, write the following command

```
>java org.jsmpp.examples.SMPPServerSimulator
0 [main] INFO org.jsmpp.examples.SMPPServerSimulator  - Listening on port 8056
```

Server shall start on port 8056

## Running Client ##

On the command prompt, run the following command (Please ensure to set the classpath as specified in running server section)

```
java org.jsmpp.examples.SimpleSubmitExample
```

On the Client Console, you shall see
```
Message submitted, message_id is 3bd5f45c
```


On the Server Console, you shall see the following logs
```
23627 [main] INFO org.jsmpp.examples.SMPPServerSimulator  - Accepting connection
 for session 1e04bacd
23659 [Thread-1] INFO org.jsmpp.session.SMPPServerSession  - Starting PDUReaderW
orker with processor degree:3 ...
23659 [pool-3-thread-1] DEBUG org.jsmpp.session.AbstractSessionContext  - Activi
ty notified
23659 [pool-1-thread-1] INFO org.jsmpp.examples.SMPPServerSimulator  - Accepting
 bind for session 1e04bacd
23659 [Thread-0] INFO org.jsmpp.session.SMPPServerSession  - Starting EnquireLin
kSender
24034 [pool-3-thread-2] DEBUG org.jsmpp.session.AbstractSessionContext  - Activi
ty notified
24424 [pool-3-thread-2] DEBUG org.jsmpp.examples.SMPPServerSimulator  - Receivin
g submit_sm jSMPP simplify SMPP on Java platform, and return message id 3bd5f45c

24440 [pool-3-thread-2] DEBUG org.jsmpp.session.state.SMPPServerSessionBoundTX
- Sending response with message_id 3bd5f45c for request with sequence_number 2
24440 [pool-3-thread-2] DEBUG org.jsmpp.examples.SMPPServerSimulator  - submit_s
m_resp with message_id 3bd5f45c has been sent
24440 [pool-3-thread-3] DEBUG org.jsmpp.session.AbstractSessionContext  - Activi
ty notified
24440 [pool-3-thread-3] INFO org.jsmpp.session.state.AbstractGenericSMPPSessionB
ound  - Receving unbind request
24456 [Thread-1] INFO org.jsmpp.session.SMPPServerSession  - PDUReaderWorker sto
p
24659 [Thread-0] INFO org.jsmpp.session.SMPPServerSession  - EnquireLinkSender s
top
```