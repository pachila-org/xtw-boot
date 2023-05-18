package org.jeecg.modules.xtw.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.util.Arrays;

@Data
public class BinDataModel {

    /** 大批次 */
    private String waferLot;

    /** 产品名 */
    private String icName;

    /** 小批次*/
    private String subLot;

    /** Site */
    private String site;

    /** SYL */
    private String syl;

    /**bin1*/
    private int bin1;

    /**bin2*/
    private int bin2;

    /**bin3*/
    private int bin3;

    /**bin4*/
    private int bin4;

    /**bin5*/
    private int bin5;

    /**bin6*/
    private int bin6;

    /**bin7*/
    private int bin7;

    /**bin8*/
    private int bin8;

    /**bin9*/
    private int bin9;

    /**bin10*/
    private int bin10;

    /**bin11*/
    private int bin11;

    /**bin12*/
    private int bin12;

    /**bin13*/
    private int bin13;

    /**bin14*/
    private int bin14;

    /**bin15*/
    private int bin15;

    /**bin16*/
    private int bin16;

    /**bin17*/
    private int bin17;

    /**bin18*/
    private int bin18;

    /**bin19*/
    private int bin19;

    /**bin20*/
    private int bin20;

    /**bin21*/
    private int bin21;

    /**bin22*/
    private int bin22;

    /**bin23*/
    private int bin23;

    /**bin24*/
    private int bin24;

    /**bin25*/
    private int bin25;

    /**bin26*/
    private int bin26;

    /**bin27*/
    private int bin27;

    /**bin28*/
    private int bin28;

    /**bin29*/
    private int bin29;

    /**bin30*/
    private int bin30;

    /**bin31*/
    private int bin31;

    /**bin32*/
    private int bin32;

    /**bin33*/
    private int bin33;

    /**bin34*/
    private int bin34;

    /**bin35*/
    private int bin35;

    /**bin36*/
    private int bin36;

    /**bin37*/
    private int bin37;

    /**bin38*/
    private int bin38;

    /**bin39*/
    private int bin39;

    /**bin40*/
    private int bin40;

    /**bin41*/
    private int bin41;

    /**bin42*/
    private int bin42;

    /**bin43*/
    private int bin43;

    /**bin44*/
    private int bin44;

    /**bin45*/
    private int bin45;

    /**bin46*/
    private int bin46;

    /**bin47*/
    private int bin47;

    /**bin48*/
    private int bin48;

    /**bin49*/
    private int bin49;

    /**bin50*/
    private int bin50;

    /**bin51*/
    private int bin51;

    /**bin52*/
    private int bin52;

    /**bin53*/
    private int bin53;

    /**bin54*/
    private int bin54;

    /**bin55*/
    private int bin55;

    /**bin56*/
    private int bin56;

    /**bin57*/
    private int bin57;

    /**bin58*/
    private int bin58;

    /**bin59*/
    private int bin59;

    /**bin60*/
    private int bin60;

    /**bin61*/
    private int bin61;

    /**bin62*/
    private int bin62;

    /**bin63*/
    private int bin63;

    /**bin64*/
    private int bin64;

    public int getThirdLevel() {
        // 取得从 bin1 到 bin64 中大小第三位的值
        int[] bins = new int[] {
                bin1, bin2, bin3, bin4, bin5, bin6, bin7, bin8, bin9, bin10,
                bin11, bin12, bin13, bin14, bin15, bin16, bin17, bin18, bin19, bin20,
                bin21, bin22, bin23, bin24, bin25, bin26, bin27, bin28, bin29, bin30,
                bin31, bin32, bin33, bin34, bin35, bin36, bin37, bin38, bin39, bin40,
                bin41, bin42, bin43, bin44, bin45, bin46, bin47, bin48, bin49, bin50,
                bin51, bin52, bin53, bin54, bin55, bin56, bin57, bin58, bin59, bin60,
                bin61, bin62, bin63, bin64
        };
        // 对 bins 进行排序
        Arrays.sort(bins);

        return bins[61];
    }

    /** test get third level */
    public static void main(String[] args) {
        BinDataModel binDataModel = new BinDataModel();
        binDataModel.setBin1(1);
        binDataModel.setBin2(2);
        binDataModel.setBin3(3);
        binDataModel.setBin4(4);
        binDataModel.setBin5(5);
        binDataModel.setBin6(6);
        binDataModel.setBin7(7);
        binDataModel.setBin8(8);
        binDataModel.setBin9(9);
        binDataModel.setBin10(10);
        binDataModel.setBin11(11);
        binDataModel.setBin12(12);
        binDataModel.setBin13(13);
        binDataModel.setBin14(14);
        binDataModel.setBin15(15);
        binDataModel.setBin16(16);
        binDataModel.setBin17(17);
        binDataModel.setBin18(18);
        binDataModel.setBin19(19);
        binDataModel.setBin20(20);
        binDataModel.setBin21(21);
        binDataModel.setBin22(22);
        binDataModel.setBin23(23);
        binDataModel.setBin24(24);
        binDataModel.setBin25(25);
        binDataModel.setBin26(26);
        binDataModel.setBin27(27);
        binDataModel.setBin28(28);
        binDataModel.setBin29(29);
        binDataModel.setBin30(30);
        binDataModel.setBin31(31);
        binDataModel.setBin32(32);
        binDataModel.setBin33(33);
        binDataModel.setBin34(34);
        binDataModel.setBin35(35);
        binDataModel.setBin36(36);
        binDataModel.setBin37(37);
        binDataModel.setBin38(38);
        binDataModel.setBin39(39);
        binDataModel.setBin40(40);
        binDataModel.setBin41(41);
        binDataModel.setBin42(42);
        binDataModel.setBin43(43);
        binDataModel.setBin44(44);
        binDataModel.setBin45(45);
        binDataModel.setBin46(46);
        binDataModel.setBin47(47);
        binDataModel.setBin48(48);
        binDataModel.setBin49(49);
        binDataModel.setBin50(50);
        binDataModel.setBin51(51);
        binDataModel.setBin52(52);
        binDataModel.setBin53(53);
        binDataModel.setBin54(54);
        binDataModel.setBin55(55);
        binDataModel.setBin56(56);
        binDataModel.setBin57(57);
        binDataModel.setBin58(58);
        binDataModel.setBin59(59);
        binDataModel.setBin60(60);
        binDataModel.setBin61(60);
        binDataModel.setBin62(8);
        binDataModel.setBin63(0);
        binDataModel.setBin64(0);

        System.out.println(binDataModel.getThirdLevel());
    }
}
