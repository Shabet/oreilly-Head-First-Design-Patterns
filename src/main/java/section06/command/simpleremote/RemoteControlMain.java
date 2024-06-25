package section06.command.simpleremote;

public class RemoteControlMain {

    public static void main(String[] args) {
        SimplerRemoteControl remote = new SimplerRemoteControl();
        Light light = new Light();

        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
