---
layout: page
title: Selwyn's Project Portfolio Page
---

## Project: CCACommander Ultra Promax Xtra 9000PLUS

### Overview

CCACommander Ultra Promax Xtra 9000PLUS is a one-stop application for CCA Heads to manage CCA members and events.
My team and I adapted the product from an existing Java application called [Address Book (Level 3)](https://se-education.org/addressbook-level3/) over a span of 1.5 months.

Given below is a summary of my contributions to the project. All of my code contributions can be found in this [RepoSense link](https://nus-cs2103-ay2324s1.github.io/tp-dashboard/?search=selwynang&breakdown=true#/).

### Features Implemented
I implemented the `deleteMember` [#104](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/104),
`deleteEvent` [#104](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/104), 
`findMember` [#146](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/146), 
`findEvent` [#146](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/146), 
`unenrol` [#179](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/179),
`undo` [#154](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/154) and
`redo` [#154](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/154) commands.
Details of some non-trivial commands are stated below.
* **Unenrol Feature** [#179](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/179)
    * **Feature details:** Allows the user of CCACommander to unenrol a member from an event which the member was enrolled to.
    * **Justifications:** Provides the user with the flexibility to remove the association between a member and event if they are no longer related to one another, which parallels what happens
  in real life when a member is no longer part of an event for the CCA.
* **Undo Command** [#154](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/154)
    * **Feature details:** Allows the user of CCACommander undo previous commands that he/she has entered, which has changed the data within CCACommander.
    * **Justifications:** Greatly increases the efficiency of the user's workflow as he/she can quickly revert commands which has affected data within CCACommander.
    * **Credits:** Implementation is inspired by [Address Book (Level 4)](https://github.com/se-edu/addressbook-level4).
* **Redo Command** [#154](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/154)
  * **Feature details:** Allows the user of CCACommander to redo a command that he/she has undone previously.
  * **Justifications:** Greatly increases the efficiency of the user's workflow as he/she can quickly redo commands that he/she has accidentally undone.
  * **Credits:** Implementation is inspired by [Address Book (Level 4)](https://github.com/se-edu/addressbook-level4).

Relevant tests were added for these commands.

### Project Management
* As the Team Lead, I managed task deadlines. I did so by setting up and managing milestones on 
[GitHub's issue tracker](https://github.com/AY2324S1-CS2103T-F11-1/tp/milestones).
* Opened and assigned [issues](https://github.com/AY2324S1-CS2103T-F11-1/tp/issues/created_by/selwynang) to every group member and ensured they are updated on what to do.
* Released Releases [v1.3](https://github.com/AY2324S1-CS2103T-F11-1/tp/releases/tag/v1.3), [v1.3.1](https://github.com/AY2324S1-CS2103T-F11-1/tp/releases/tag/v1.3.1) and [v1.4](https://github.com/AY2324S1-CS2103T-F11-1/tp/releases/tag/v1.4) on GitHub.

### Documentation
* **User Guide**
  * Created the annotated screenshots in the User Guide.
  * Added command details and summaries for the following commands: `deleteMember`, `deleteEvent`, `findMember`, `findEvent`,
  `unenrol`, `undo` and `redo`.
* **Developer Guide**
  * Added implementation details for the `undo`/`redo` feature.
  * Created the Planned Enhancements section and added 5 planned enhancements:
    * Allow users to add / delete tags without retyping previous tags
    * Allow users to create and edit a member/event with name containing non-alphanumeric characters
    * Provide more specific index error messages to the user
    * Provide specific error messages for unknown prefixes
    * Show a more specific error message for negative index in `editMember`, `editEvent`, `viewMember`, `viewEvent`, `deleteMember` and `deleteEvent` commands.
  * Added 3 Use Cases: UC02 - Delete a member, UC03 - List all members, UC04 - List all events

### Community
* This is the full [list](https://github.com/AY2324S1-CS2103T-F11-1/tp/pulls?q=is%3Apr+reviewed-by%3Aselwynang) of pull requests which I have reviewed.
* Some non-trival pull request review comments which I have given: [#179](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/179#discussion_r1375403205),
[#254](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/254)
