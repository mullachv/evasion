package evasion.connections;
public interface GameWithPlayerSocket {
    public void ReceivedMessageFromPlayerSocket(String message);
    public void ConnectionMadeWithPlayerSocket();
}
