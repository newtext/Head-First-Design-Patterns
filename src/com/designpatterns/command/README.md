# Command Pattern

The <b> Command Pattern </b> encapsulates a request as an object, thereby letting you parameterize other objects
with different requests, queue or log requests, and support undoable operations.

The command pattern should be used when:
- You need a command to have a life span independent of the original request, or if you want to queue, specify and execute requests at different times.
- You need undo/redo operations. The command’s execution can be stored for reversing its effects. It is important that the Command class implements the methods undo and redo.
- You need to structure a system around high-level operations built on primitive operations.

The command pattern has several advantages, summarised in the following points:
- It decouples the classes that invoke the operation from the object that knows how to execute the operation.
- It allows you to create a sequence of commands by providing a queue system.
- Implementing extensions to add a new command is easy and can be done without changing the existing code.
- You can also define a rollback system with the Command pattern — like in the Wizard example, we could write a rollback method.
- Have strict control over how and when commands are invoked.
- The code is easier to use, understand and test since the commands simplify the code.


Command = Request

- Client = RemoteLoader
- Invoker = RemoteController
- Command = Command Interface
- Receiver = Light/Stereo/GarageDoor
- ConcreteCommands = LightsOnCommand/LightsOffCommand/StereoOffCommand/StereoOnCommand
- execute() = ConcreteCommands' execute method

<img align="left" src="https://github.com/newtext/Head-First-Design-Patterns/blob/main/src/com/designpatterns/command/Pictures/command.png">

<img align="left" src="https://github.com/newtext/Head-First-Design-Patterns/blob/main/src/com/designpatterns/command/Pictures/command_invoke.png">

<img align="left" src="https://github.com/newtext/Head-First-Design-Patterns/blob/main/src/com/designpatterns/command/Pictures/command_pattern_diagram.png">


