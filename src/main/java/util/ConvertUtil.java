package util;

/**
 * @author : gaoxiaodong04
 * @program : bigfile-operator
 * @date : 2021-02-23 20:38
 * @description :
 */
public abstract class ConvertUtil {
    public static byte[] int2Bytes(int num) {
        byte[] byteNum = new byte[4];
        for (int ix = 0; ix < 4; ++ix) {
            int offset = 32 - ((ix + 1) << 3);
            byteNum[ix] = (byte) ((num >> offset) & 0xff);
        }
        return byteNum;
    }

    public static int bytes2Int(byte[] byteNum) {
        int num = 0;
        for (int ix = 0; ix < 4; ++ix) {
            num <<= 8;
            num |= (byteNum[ix] & 0xff);
        }
        return num;
    }

    public static byte int2OneByte(int num) {
        return (byte) (num & 0x000000ff);
    }

    public static int oneByte2Int(byte byteNum) {
        return byteNum > 0 ? byteNum : (128 + (128 + byteNum));
    }

    public static byte[] long2Bytes(long num) {
        byte[] byteNum = new byte[8];
        for (int ix = 0; ix < 8; ++ix) {
            int offset = 64 - ((ix + 1) << 3);
            byteNum[ix] = (byte) ((num >> offset) & 0xff);
        }
        return byteNum;
    }

    public static long bytes2Long(byte[] byteNum) {
        long num = 0;
        for (int ix = 0; ix < 8; ++ix) {
            num <<= 8;
            num |= (byteNum[ix] & 0xff);
        }
        return num;
    }
}
