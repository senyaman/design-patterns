package pattern.adapter;

public interface USB {
    void usbOnly();
}

class MemoryCard {
    public void insert() {
        System.out.println("Memory card inserted!");
    }

    public void readData() {
        System.out.println("Computer is reading information from the memory card!");
    }
}

class CardReaderAdapter implements USB {

    private final MemoryCard memoryCard;

    public CardReaderAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void usbOnly() {
        this.memoryCard.insert();
        this.memoryCard.readData();
    }
}
