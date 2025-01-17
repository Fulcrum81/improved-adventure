package goods.electronics.components;

public enum Processor {
    amd(1839),
    intel(2345),
    baikal(1111),
    appleSilicon(1234);

    public int processorCode;

    Processor(int code) {
        processorCode = code;
    }

    public String getNameAndCode() {
        return (this.toString() + " " + processorCode);
    }
}
