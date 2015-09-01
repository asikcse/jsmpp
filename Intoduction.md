# Introduction (What is jSMPP?) #

jSMPP is an API that has goals to be easy to use to communicate with SMSC.


# Why create jSMPP #

The first point is I never use another SMPP API and the need **component** (interfaces) that able to communicate with SMSC. These component should be _reusable_, another application can use this component with **minimal dependencies**.

# Why use jSMPP #

First thing is as I explained above, jSMPP is component -> can be reused with minimum dependencies. The second thing is about complexity. When we handle with socket we should have a threading on our code, I want to minimize that. So the threading and socket complexity is wrapped on the API, we only have to understand the the API (and also the protocol).