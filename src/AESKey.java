public class AESKey {

    private byte[] keyBytes;

    public AESKey(byte[] keyBytes) {
        this.keyBytes = keyBytes;
    }

    public byte[] getKeyBytes() {
        return keyBytes;
    }
}
