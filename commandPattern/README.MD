## Programming Challenge

Design a system that uses a special remote control to send commands to different devices. The key idea is to create a way for the remote control to control multiple devices without knowing the specifics of each device. Specifically:

Create a remote control that can send commands like "Power On" and "Power Off."

Implement separate commands for "Switch On" and "Switch Off."

Develop a system where devices (e.g., TV, stereo, lights) can respond to these commands. Each device should have its unique behavior for turning on and off.

Ensure that the remote control can send these commands to any device without knowing how each device works internally.

Your challenge is to apply a design pattern that allows this remote control to be flexible and extensible, enabling it to control various devices effortlessly. This should be achieved without the remote control having to understand the specific details of how each device operates.

## UML Diagram
![UML class](https://github.com/user-attachments/assets/55cec3bf-5d7c-4bd8-96c6-78b50732af3a)

## Components

Revised UML Diagram (Description)
Client (ViewerApp):

The ViewerApp remains as the client, which now has a menu to select which device (TV, Stereo, Lights, Ceiling Fan) to control.
Invoker (RemoteControl):

The RemoteControl class still has a +clickButton() method that invokes the execute() method of the Command.
Interface Command:

The Command interface is unchanged, with the method +execute().
Concrete Commands (PowerOn and PowerOff):

Both PowerOn and PowerOff are concrete command classes that implement Command. These now apply not only to the TV but also to the Stereo, Lights, and Ceiling Fan.
Receivers:

The TV receiver remains as before.
New Receivers:
CeilingFan: Has methods +switchOn() and +switchOff().
Stereo: Has methods +switchOn() and +switchOff().
Lights: Has methods +switchOn() and +switchOff().
