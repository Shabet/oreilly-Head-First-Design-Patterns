package section06.command.simpleremote;

public class SimplerRemoteControl {
    Command slot;
    public SimplerRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
