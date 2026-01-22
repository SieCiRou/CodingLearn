public class JavaSe8_1_2 {
    public static void main (String[] args){
        byte b = 0b0001_0001;
        short s = (short) 0b1001_0001_0100_0101;
        int i1 = 0B1001_0001_0100_0101_1010_0001_0100_0101;

        // java 7 之後可以在數字常量numeric literals內使用"_" 提高數字常量的可讀性
        long creditCardNumber = 1234_5678_9012_3456L;
        long secialSecurityNumber = 999_99_9999L;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;
        // 不能放在數字前後 ;鄰近小數點 ;在F或L前 ;預期數字該出現的地方
        // float pi1 = 3_.1415F;
        // float pi2 = 3._1415F;
        // long 1 = 999_99_9999_L;
        // int x1 = _52;
        int x2 = 5_2;
        // int x3 = 52_;
        int x4 = 5__________2;
        // int x5 = 0_x52;
        // int x6 = 0x_52;
        int x7 = 0x5_2;
        // int x8 = 0x52_;
        int x9 = 0_52;
        int x10 = 05_2;
        // int x11 = 052_;

    }
}
