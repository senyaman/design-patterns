package pattern.adapter;

public class Main {
    public static void main(String[] args) {
        USB cardReader = new CardReaderAdapter(new MemoryCard());
        cardReader.usbOnly();
    }
}
