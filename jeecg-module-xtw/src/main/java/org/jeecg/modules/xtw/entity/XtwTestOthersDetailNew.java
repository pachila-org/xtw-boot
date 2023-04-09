package org.jeecg.modules.xtw.entity;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecg.common.aspect.annotation.Dict;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @Description: xtw_test_others_detail_new
 * @Author: jeecg-boot
 * @Date:   2023-04-09
 * @Version: V1.0
 */
@Data
@TableName("xtw_test_others_detail_new")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="xtw_test_others_detail_new对象", description="xtw_test_others_detail_new")
public class XtwTestOthersDetailNew implements Serializable {
    private static final long serialVersionUID = 1L;

	/**id*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "id")
    private java.lang.String id;
	/**测试记录ID*/
	@Excel(name = "测试记录ID", width = 15)
    @ApiModelProperty(value = "测试记录ID")
    private java.lang.String testRecordId;
	/**Site*/
	@Excel(name = "Site", width = 15)
    @ApiModelProperty(value = "Site")
    private java.lang.String site;
	/**统计维度*/
	@Excel(name = "统计维度", width = 15)
    @ApiModelProperty(value = "统计维度")
    private java.lang.String dimension;
	/**OS_TEST_DIN(V)*/
	@Excel(name = "OS_TEST_DIN(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_DIN(V)")
    private java.lang.String osTestDin;
	/**OS_TEST_SLK(V)*/
	@Excel(name = "OS_TEST_SLK(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_SLK(V)")
    private java.lang.String osTestSlk;
	/**OS_TEST_LOAD(V)*/
	@Excel(name = "OS_TEST_LOAD(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_LOAD(V)")
    private java.lang.String osTestLoad;
	/**OS_TEST_OUT0(V)*/
	@Excel(name = "OS_TEST_OUT0(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_OUT0(V)")
    private java.lang.String osTestOut0;
	/**OS_TEST_OUT1(V)*/
	@Excel(name = "OS_TEST_OUT1(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_OUT1(V)")
    private java.lang.String osTestOut1;
	/**OS_TEST_OUT2(V)*/
	@Excel(name = "OS_TEST_OUT2(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_OUT2(V)")
    private java.lang.String osTestOut2;
	/**OS_TEST_OUT3(V)*/
	@Excel(name = "OS_TEST_OUT3(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_OUT3(V)")
    private java.lang.String osTestOut3;
	/**OS_TEST_OUT4(V)*/
	@Excel(name = "OS_TEST_OUT4(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_OUT4(V)")
    private java.lang.String osTestOut4;
	/**OS_TEST_OUT5(V)*/
	@Excel(name = "OS_TEST_OUT5(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_OUT5(V)")
    private java.lang.String osTestOut5;
	/**OS_TEST_OUT6(V)*/
	@Excel(name = "OS_TEST_OUT6(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_OUT6(V)")
    private java.lang.String osTestOut6;
	/**OS_TEST_OUT7(V)*/
	@Excel(name = "OS_TEST_OUT7(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_OUT7(V)")
    private java.lang.String osTestOut7;
	/**OS_TEST_OUT8(V)*/
	@Excel(name = "OS_TEST_OUT8(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_OUT8(V)")
    private java.lang.String osTestOut8;
	/**OS_TEST_OUT9(V)*/
	@Excel(name = "OS_TEST_OUT9(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_OUT9(V)")
    private java.lang.String osTestOut9;
	/**OS_TEST_OUT10(V)*/
	@Excel(name = "OS_TEST_OUT10(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_OUT10(V)")
    private java.lang.String osTestOut10;
	/**OS_TEST_OUT11(V)*/
	@Excel(name = "OS_TEST_OUT11(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_OUT11(V)")
    private java.lang.String osTestOut11;
	/**OS_TEST_OUT12(V)*/
	@Excel(name = "OS_TEST_OUT12(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_OUT12(V)")
    private java.lang.String osTestOut12;
	/**OS_TEST_OUT13(V)*/
	@Excel(name = "OS_TEST_OUT13(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_OUT13(V)")
    private java.lang.String osTestOut13;
	/**OS_TEST_OUT14(V)*/
	@Excel(name = "OS_TEST_OUT14(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_OUT14(V)")
    private java.lang.String osTestOut14;
	/**OS_TEST_OUT15(V)*/
	@Excel(name = "OS_TEST_OUT15(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_OUT15(V)")
    private java.lang.String osTestOut15;
	/**OS_TEST_OEB(V)*/
	@Excel(name = "OS_TEST_OEB(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_OEB(V)")
    private java.lang.String osTestOeb;
	/**OS_TEST_DOUT(V)*/
	@Excel(name = "OS_TEST_DOUT(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_DOUT(V)")
    private java.lang.String osTestDout;
	/**OS_TEST_R_EXT(V)*/
	@Excel(name = "OS_TEST_R_EXT(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_R_EXT(V)")
    private java.lang.String osTestRExt;
	/**OS_TEST_PUSH_DIN(V)*/
	@Excel(name = "OS_TEST_PUSH_DIN(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_PUSH_DIN(V)")
    private java.lang.String osTestPushDin;
	/**OS_TEST_PUSH_OUT0(V)*/
	@Excel(name = "OS_TEST_PUSH_OUT0(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_PUSH_OUT0(V)")
    private java.lang.String osTestPushOut0;
	/**OS_TEST_PUSH_OUT1(V)*/
	@Excel(name = "OS_TEST_PUSH_OUT1(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_PUSH_OUT1(V)")
    private java.lang.String osTestPushOut1;
	/**OS_TEST_PUSH_OUT2(V)*/
	@Excel(name = "OS_TEST_PUSH_OUT2(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_PUSH_OUT2(V)")
    private java.lang.String osTestPushOut2;
	/**OS_TEST_PUSH_OUT3(V)*/
	@Excel(name = "OS_TEST_PUSH_OUT3(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_PUSH_OUT3(V)")
    private java.lang.String osTestPushOut3;
	/**OS_TEST_PUSH_OUT4(V)*/
	@Excel(name = "OS_TEST_PUSH_OUT4(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_PUSH_OUT4(V)")
    private java.lang.String osTestPushOut4;
	/**OS_TEST_PUSH_OUT5(V)*/
	@Excel(name = "OS_TEST_PUSH_OUT5(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_PUSH_OUT5(V)")
    private java.lang.String osTestPushOut5;
	/**OS_TEST_PUSH_OUT6(V)*/
	@Excel(name = "OS_TEST_PUSH_OUT6(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_PUSH_OUT6(V)")
    private java.lang.String osTestPushOut6;
	/**OS_TEST_PUSH_OUT7(V)*/
	@Excel(name = "OS_TEST_PUSH_OUT7(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_PUSH_OUT7(V)")
    private java.lang.String osTestPushOut7;
	/**OS_TEST_PUSH_OUT8(V)*/
	@Excel(name = "OS_TEST_PUSH_OUT8(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_PUSH_OUT8(V)")
    private java.lang.String osTestPushOut8;
	/**OS_TEST_PUSH_OUT9(V)*/
	@Excel(name = "OS_TEST_PUSH_OUT9(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_PUSH_OUT9(V)")
    private java.lang.String osTestPushOut9;
	/**OS_TEST_PUSH_OUT10(V)*/
	@Excel(name = "OS_TEST_PUSH_OUT10(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_PUSH_OUT10(V)")
    private java.lang.String osTestPushOut10;
	/**OS_TEST_PUSH_OUT11(V)*/
	@Excel(name = "OS_TEST_PUSH_OUT11(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_PUSH_OUT11(V)")
    private java.lang.String osTestPushOut11;
	/**OS_TEST_PUSH_OUT12(V)*/
	@Excel(name = "OS_TEST_PUSH_OUT12(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_PUSH_OUT12(V)")
    private java.lang.String osTestPushOut12;
	/**OS_TEST_PUSH_OUT13(V)*/
	@Excel(name = "OS_TEST_PUSH_OUT13(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_PUSH_OUT13(V)")
    private java.lang.String osTestPushOut13;
	/**OS_TEST_PUSH_OUT14(V)*/
	@Excel(name = "OS_TEST_PUSH_OUT14(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_PUSH_OUT14(V)")
    private java.lang.String osTestPushOut14;
	/**OS_TEST_PUSH_OUT15(V)*/
	@Excel(name = "OS_TEST_PUSH_OUT15(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_PUSH_OUT15(V)")
    private java.lang.String osTestPushOut15;
	/**OS_TEST_PUSH_DOUT(V)*/
	@Excel(name = "OS_TEST_PUSH_DOUT(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_PUSH_DOUT(V)")
    private java.lang.String osTestPushDout;
	/**OS_TEST_PUSH_R_EXT(V)*/
	@Excel(name = "OS_TEST_PUSH_R_EXT(V)", width = 15)
    @ApiModelProperty(value = "OS_TEST_PUSH_R_EXT(V)")
    private java.lang.String osTestPushRExt;
	/**V_REXT_3V(V)*/
	@Excel(name = "V_REXT_3V(V)", width = 15)
    @ApiModelProperty(value = "V_REXT_3V(V)")
    private java.lang.String vRext3v;
	/**V_REXT_DIFF(mV)*/
	@Excel(name = "V_REXT_DIFF(mV)", width = 15)
    @ApiModelProperty(value = "V_REXT_DIFF(mV)")
    private java.lang.String vRextDiff;
	/**V_REXT_3V1(V)*/
	@Excel(name = "V_REXT_3V1(V)", width = 15)
    @ApiModelProperty(value = "V_REXT_3V1(V)")
    private java.lang.String vRext3v1;
	/**DIFF_VREXT(V)*/
	@Excel(name = "DIFF_VREXT(V)", width = 15)
    @ApiModelProperty(value = "DIFF_VREXT(V)")
    private java.lang.String diffVrext;
	/**IOUTA0(MA)*/
	@Excel(name = "IOUTA0(MA)", width = 15)
    @ApiModelProperty(value = "IOUTA0(MA)")
    private java.lang.String iouta0;
	/**IOUTA1(MA)*/
	@Excel(name = "IOUTA1(MA)", width = 15)
    @ApiModelProperty(value = "IOUTA1(MA)")
    private java.lang.String iouta1;
	/**IOUTA2(MA)*/
	@Excel(name = "IOUTA2(MA)", width = 15)
    @ApiModelProperty(value = "IOUTA2(MA)")
    private java.lang.String iouta2;
	/**IOUTA3(MA)*/
	@Excel(name = "IOUTA3(MA)", width = 15)
    @ApiModelProperty(value = "IOUTA3(MA)")
    private java.lang.String iouta3;
	/**IOUTA4(MA)*/
	@Excel(name = "IOUTA4(MA)", width = 15)
    @ApiModelProperty(value = "IOUTA4(MA)")
    private java.lang.String iouta4;
	/**IOUTA5(MA)*/
	@Excel(name = "IOUTA5(MA)", width = 15)
    @ApiModelProperty(value = "IOUTA5(MA)")
    private java.lang.String iouta5;
	/**IOUTA6(MA)*/
	@Excel(name = "IOUTA6(MA)", width = 15)
    @ApiModelProperty(value = "IOUTA6(MA)")
    private java.lang.String iouta6;
	/**IOUTA7(MA)*/
	@Excel(name = "IOUTA7(MA)", width = 15)
    @ApiModelProperty(value = "IOUTA7(MA)")
    private java.lang.String iouta7;
	/**IOUTA8(MA)*/
	@Excel(name = "IOUTA8(MA)", width = 15)
    @ApiModelProperty(value = "IOUTA8(MA)")
    private java.lang.String iouta8;
	/**IOUTA9(MA)*/
	@Excel(name = "IOUTA9(MA)", width = 15)
    @ApiModelProperty(value = "IOUTA9(MA)")
    private java.lang.String iouta9;
	/**IOUTA10(MA)*/
	@Excel(name = "IOUTA10(MA)", width = 15)
    @ApiModelProperty(value = "IOUTA10(MA)")
    private java.lang.String iouta10;
	/**IOUTA11(MA)*/
	@Excel(name = "IOUTA11(MA)", width = 15)
    @ApiModelProperty(value = "IOUTA11(MA)")
    private java.lang.String iouta11;
	/**IOUTA12(MA)*/
	@Excel(name = "IOUTA12(MA)", width = 15)
    @ApiModelProperty(value = "IOUTA12(MA)")
    private java.lang.String iouta12;
	/**IOUTA13(MA)*/
	@Excel(name = "IOUTA13(MA)", width = 15)
    @ApiModelProperty(value = "IOUTA13(MA)")
    private java.lang.String iouta13;
	/**IOUTA14(MA)*/
	@Excel(name = "IOUTA14(MA)", width = 15)
    @ApiModelProperty(value = "IOUTA14(MA)")
    private java.lang.String iouta14;
	/**IOUTA15(MA)*/
	@Excel(name = "IOUTA15(MA)", width = 15)
    @ApiModelProperty(value = "IOUTA15(MA)")
    private java.lang.String iouta15;
	/**IOUTA_MAX(mA)*/
	@Excel(name = "IOUTA_MAX(mA)", width = 15)
    @ApiModelProperty(value = "IOUTA_MAX(mA)")
    private java.lang.String ioutaMax;
	/**IOUTA_MIN(mA)*/
	@Excel(name = "IOUTA_MIN(mA)", width = 15)
    @ApiModelProperty(value = "IOUTA_MIN(mA)")
    private java.lang.String ioutaMin;
	/**IOUTA_AVG(mA)*/
	@Excel(name = "IOUTA_AVG(mA)", width = 15)
    @ApiModelProperty(value = "IOUTA_AVG(mA)")
    private java.lang.String ioutaAvg;
	/**IOUTB0(MA)*/
	@Excel(name = "IOUTB0(MA)", width = 15)
    @ApiModelProperty(value = "IOUTB0(MA)")
    private java.lang.String ioutb0;
	/**IOUTB1(MA)*/
	@Excel(name = "IOUTB1(MA)", width = 15)
    @ApiModelProperty(value = "IOUTB1(MA)")
    private java.lang.String ioutb1;
	/**IOUTB2(MA)*/
	@Excel(name = "IOUTB2(MA)", width = 15)
    @ApiModelProperty(value = "IOUTB2(MA)")
    private java.lang.String ioutb2;
	/**IOUTB3(MA)*/
	@Excel(name = "IOUTB3(MA)", width = 15)
    @ApiModelProperty(value = "IOUTB3(MA)")
    private java.lang.String ioutb3;
	/**IOUTB4(MA)*/
	@Excel(name = "IOUTB4(MA)", width = 15)
    @ApiModelProperty(value = "IOUTB4(MA)")
    private java.lang.String ioutb4;
	/**IOUTB5(MA)*/
	@Excel(name = "IOUTB5(MA)", width = 15)
    @ApiModelProperty(value = "IOUTB5(MA)")
    private java.lang.String ioutb5;
	/**IOUTB6(MA)*/
	@Excel(name = "IOUTB6(MA)", width = 15)
    @ApiModelProperty(value = "IOUTB6(MA)")
    private java.lang.String ioutb6;
	/**IOUTB7(MA)*/
	@Excel(name = "IOUTB7(MA)", width = 15)
    @ApiModelProperty(value = "IOUTB7(MA)")
    private java.lang.String ioutb7;
	/**IOUTB8(MA)*/
	@Excel(name = "IOUTB8(MA)", width = 15)
    @ApiModelProperty(value = "IOUTB8(MA)")
    private java.lang.String ioutb8;
	/**IOUTB9(MA)*/
	@Excel(name = "IOUTB9(MA)", width = 15)
    @ApiModelProperty(value = "IOUTB9(MA)")
    private java.lang.String ioutb9;
	/**IOUTB10(MA)*/
	@Excel(name = "IOUTB10(MA)", width = 15)
    @ApiModelProperty(value = "IOUTB10(MA)")
    private java.lang.String ioutb10;
	/**IOUTB11(MA)*/
	@Excel(name = "IOUTB11(MA)", width = 15)
    @ApiModelProperty(value = "IOUTB11(MA)")
    private java.lang.String ioutb11;
	/**IOUTB12(MA)*/
	@Excel(name = "IOUTB12(MA)", width = 15)
    @ApiModelProperty(value = "IOUTB12(MA)")
    private java.lang.String ioutb12;
	/**IOUTB13(MA)*/
	@Excel(name = "IOUTB13(MA)", width = 15)
    @ApiModelProperty(value = "IOUTB13(MA)")
    private java.lang.String ioutb13;
	/**IOUTB14(MA)*/
	@Excel(name = "IOUTB14(MA)", width = 15)
    @ApiModelProperty(value = "IOUTB14(MA)")
    private java.lang.String ioutb14;
	/**IOUTB15(MA)*/
	@Excel(name = "IOUTB15(MA)", width = 15)
    @ApiModelProperty(value = "IOUTB15(MA)")
    private java.lang.String ioutb15;
	/**IOUTB_MAX(mA)*/
	@Excel(name = "IOUTB_MAX(mA)", width = 15)
    @ApiModelProperty(value = "IOUTB_MAX(mA)")
    private java.lang.String ioutbMax;
	/**IOUTB_MIN(mA)*/
	@Excel(name = "IOUTB_MIN(mA)", width = 15)
    @ApiModelProperty(value = "IOUTB_MIN(mA)")
    private java.lang.String ioutbMin;
	/**IOUTB_AVG(mA)*/
	@Excel(name = "IOUTB_AVG(mA)", width = 15)
    @ApiModelProperty(value = "IOUTB_AVG(mA)")
    private java.lang.String ioutbAvg;
	/**IDIFF8_TEST(A)*/
	@Excel(name = "IDIFF8_TEST(A)", width = 15)
    @ApiModelProperty(value = "IDIFF8_TEST(A)")
    private java.lang.String idiff8Test;
	/**IDIFF8A_TEST(A)*/
	@Excel(name = "IDIFF8A_TEST(A)", width = 15)
    @ApiModelProperty(value = "IDIFF8A_TEST(A)")
    private java.lang.String idiff8aTest;
	/**IDIFF8B_TEST(A)*/
	@Excel(name = "IDIFF8B_TEST(A)", width = 15)
    @ApiModelProperty(value = "IDIFF8B_TEST(A)")
    private java.lang.String idiff8bTest;
	/**IDIFF8AA_TEST(A)*/
	@Excel(name = "IDIFF8AA_TEST(A)", width = 15)
    @ApiModelProperty(value = "IDIFF8AA_TEST(A)")
    private java.lang.String idiff8aaTest;
	/**IDIFF8BB_TEST(A)*/
	@Excel(name = "IDIFF8BB_TEST(A)", width = 15)
    @ApiModelProperty(value = "IDIFF8BB_TEST(A)")
    private java.lang.String idiff8bbTest;
	/**IOUTC0(MA)*/
	@Excel(name = "IOUTC0(MA)", width = 15)
    @ApiModelProperty(value = "IOUTC0(MA)")
    private java.lang.String ioutc0;
	/**IOUTC1(MA)*/
	@Excel(name = "IOUTC1(MA)", width = 15)
    @ApiModelProperty(value = "IOUTC1(MA)")
    private java.lang.String ioutc1;
	/**IOUTC2(MA)*/
	@Excel(name = "IOUTC2(MA)", width = 15)
    @ApiModelProperty(value = "IOUTC2(MA)")
    private java.lang.String ioutc2;
	/**IOUTC3(MA)*/
	@Excel(name = "IOUTC3(MA)", width = 15)
    @ApiModelProperty(value = "IOUTC3(MA)")
    private java.lang.String ioutc3;
	/**IOUTC4(MA)*/
	@Excel(name = "IOUTC4(MA)", width = 15)
    @ApiModelProperty(value = "IOUTC4(MA)")
    private java.lang.String ioutc4;
	/**IOUTC5(MA)*/
	@Excel(name = "IOUTC5(MA)", width = 15)
    @ApiModelProperty(value = "IOUTC5(MA)")
    private java.lang.String ioutc5;
	/**IOUTC6(MA)*/
	@Excel(name = "IOUTC6(MA)", width = 15)
    @ApiModelProperty(value = "IOUTC6(MA)")
    private java.lang.String ioutc6;
	/**IOUTC7(MA)*/
	@Excel(name = "IOUTC7(MA)", width = 15)
    @ApiModelProperty(value = "IOUTC7(MA)")
    private java.lang.String ioutc7;
	/**IOUTC8(MA)*/
	@Excel(name = "IOUTC8(MA)", width = 15)
    @ApiModelProperty(value = "IOUTC8(MA)")
    private java.lang.String ioutc8;
	/**IOUTC9(MA)*/
	@Excel(name = "IOUTC9(MA)", width = 15)
    @ApiModelProperty(value = "IOUTC9(MA)")
    private java.lang.String ioutc9;
	/**IOUTC10(MA)*/
	@Excel(name = "IOUTC10(MA)", width = 15)
    @ApiModelProperty(value = "IOUTC10(MA)")
    private java.lang.String ioutc10;
	/**IOUTC11(MA)*/
	@Excel(name = "IOUTC11(MA)", width = 15)
    @ApiModelProperty(value = "IOUTC11(MA)")
    private java.lang.String ioutc11;
	/**IOUTC12(MA)*/
	@Excel(name = "IOUTC12(MA)", width = 15)
    @ApiModelProperty(value = "IOUTC12(MA)")
    private java.lang.String ioutc12;
	/**IOUTC13(MA)*/
	@Excel(name = "IOUTC13(MA)", width = 15)
    @ApiModelProperty(value = "IOUTC13(MA)")
    private java.lang.String ioutc13;
	/**IOUTC14(MA)*/
	@Excel(name = "IOUTC14(MA)", width = 15)
    @ApiModelProperty(value = "IOUTC14(MA)")
    private java.lang.String ioutc14;
	/**IOUTC15(MA)*/
	@Excel(name = "IOUTC15(MA)", width = 15)
    @ApiModelProperty(value = "IOUTC15(MA)")
    private java.lang.String ioutc15;
	/**IOUTC_MAX(mA)*/
	@Excel(name = "IOUTC_MAX(mA)", width = 15)
    @ApiModelProperty(value = "IOUTC_MAX(mA)")
    private java.lang.String ioutcMax;
	/**IOUTC_MIN(mA)*/
	@Excel(name = "IOUTC_MIN(mA)", width = 15)
    @ApiModelProperty(value = "IOUTC_MIN(mA)")
    private java.lang.String ioutcMin;
	/**IOUTC_AVG(mA)*/
	@Excel(name = "IOUTC_AVG(mA)", width = 15)
    @ApiModelProperty(value = "IOUTC_AVG(mA)")
    private java.lang.String ioutcAvg;
	/**CA2D8V_IDIFF8_TEST(A)*/
	@Excel(name = "CA2D8V_IDIFF8_TEST(A)", width = 15)
    @ApiModelProperty(value = "CA2D8V_IDIFF8_TEST(A)")
    private java.lang.String ca2d8vIdiff8Test;
	/**CA2D8V_IDIFF8A_TEST(A)*/
	@Excel(name = "CA2D8V_IDIFF8A_TEST(A)", width = 15)
    @ApiModelProperty(value = "CA2D8V_IDIFF8A_TEST(A)")
    private java.lang.String ca2d8vIdiff8aTest;
	/**CA2D8V_IDIFF8B_TEST(A)*/
	@Excel(name = "CA2D8V_IDIFF8B_TEST(A)", width = 15)
    @ApiModelProperty(value = "CA2D8V_IDIFF8B_TEST(A)")
    private java.lang.String ca2d8vIdiff8bTest;
	/**IOUTD0(MA)*/
	@Excel(name = "IOUTD0(MA)", width = 15)
    @ApiModelProperty(value = "IOUTD0(MA)")
    private java.lang.String ioutd0;
	/**IOUTD1(MA)*/
	@Excel(name = "IOUTD1(MA)", width = 15)
    @ApiModelProperty(value = "IOUTD1(MA)")
    private java.lang.String ioutd1;
	/**IOUTD2(MA)*/
	@Excel(name = "IOUTD2(MA)", width = 15)
    @ApiModelProperty(value = "IOUTD2(MA)")
    private java.lang.String ioutd2;
	/**IOUTD3(MA)*/
	@Excel(name = "IOUTD3(MA)", width = 15)
    @ApiModelProperty(value = "IOUTD3(MA)")
    private java.lang.String ioutd3;
	/**IOUTD4(MA)*/
	@Excel(name = "IOUTD4(MA)", width = 15)
    @ApiModelProperty(value = "IOUTD4(MA)")
    private java.lang.String ioutd4;
	/**IOUTD5(MA)*/
	@Excel(name = "IOUTD5(MA)", width = 15)
    @ApiModelProperty(value = "IOUTD5(MA)")
    private java.lang.String ioutd5;
	/**IOUTD6(MA)*/
	@Excel(name = "IOUTD6(MA)", width = 15)
    @ApiModelProperty(value = "IOUTD6(MA)")
    private java.lang.String ioutd6;
	/**IOUTD7(MA)*/
	@Excel(name = "IOUTD7(MA)", width = 15)
    @ApiModelProperty(value = "IOUTD7(MA)")
    private java.lang.String ioutd7;
	/**IOUTD8(MA)*/
	@Excel(name = "IOUTD8(MA)", width = 15)
    @ApiModelProperty(value = "IOUTD8(MA)")
    private java.lang.String ioutd8;
	/**IOUTD9(MA)*/
	@Excel(name = "IOUTD9(MA)", width = 15)
    @ApiModelProperty(value = "IOUTD9(MA)")
    private java.lang.String ioutd9;
	/**IOUTD10(MA)*/
	@Excel(name = "IOUTD10(MA)", width = 15)
    @ApiModelProperty(value = "IOUTD10(MA)")
    private java.lang.String ioutd10;
	/**IOUTD11(MA)*/
	@Excel(name = "IOUTD11(MA)", width = 15)
    @ApiModelProperty(value = "IOUTD11(MA)")
    private java.lang.String ioutd11;
	/**IOUTD12(MA)*/
	@Excel(name = "IOUTD12(MA)", width = 15)
    @ApiModelProperty(value = "IOUTD12(MA)")
    private java.lang.String ioutd12;
	/**IOUTD13(MA)*/
	@Excel(name = "IOUTD13(MA)", width = 15)
    @ApiModelProperty(value = "IOUTD13(MA)")
    private java.lang.String ioutd13;
	/**IOUTD14(MA)*/
	@Excel(name = "IOUTD14(MA)", width = 15)
    @ApiModelProperty(value = "IOUTD14(MA)")
    private java.lang.String ioutd14;
	/**IOUTD15(MA)*/
	@Excel(name = "IOUTD15(MA)", width = 15)
    @ApiModelProperty(value = "IOUTD15(MA)")
    private java.lang.String ioutd15;
	/**IOUTD_MAX(mA)*/
	@Excel(name = "IOUTD_MAX(mA)", width = 15)
    @ApiModelProperty(value = "IOUTD_MAX(mA)")
    private java.lang.String ioutdMax;
	/**IOUTD_MIN(mA)*/
	@Excel(name = "IOUTD_MIN(mA)", width = 15)
    @ApiModelProperty(value = "IOUTD_MIN(mA)")
    private java.lang.String ioutdMin;
	/**IOUTD_AVG(mA)*/
	@Excel(name = "IOUTD_AVG(mA)", width = 15)
    @ApiModelProperty(value = "IOUTD_AVG(mA)")
    private java.lang.String ioutdAvg;
	/**DiffD_TEST(A)*/
	@Excel(name = "DiffD_TEST(A)", width = 15)
    @ApiModelProperty(value = "DiffD_TEST(A)")
    private java.lang.String diffdTest;
	/**IoutE0(MA)*/
	@Excel(name = "IoutE0(MA)", width = 15)
    @ApiModelProperty(value = "IoutE0(MA)")
    private java.lang.String ioute0;
	/**IoutE1(MA)*/
	@Excel(name = "IoutE1(MA)", width = 15)
    @ApiModelProperty(value = "IoutE1(MA)")
    private java.lang.String ioute1;
	/**IoutE2(MA)*/
	@Excel(name = "IoutE2(MA)", width = 15)
    @ApiModelProperty(value = "IoutE2(MA)")
    private java.lang.String ioute2;
	/**IoutE3(MA)*/
	@Excel(name = "IoutE3(MA)", width = 15)
    @ApiModelProperty(value = "IoutE3(MA)")
    private java.lang.String ioute3;
	/**IoutE4(MA)*/
	@Excel(name = "IoutE4(MA)", width = 15)
    @ApiModelProperty(value = "IoutE4(MA)")
    private java.lang.String ioute4;
	/**IoutE5(MA)*/
	@Excel(name = "IoutE5(MA)", width = 15)
    @ApiModelProperty(value = "IoutE5(MA)")
    private java.lang.String ioute5;
	/**IoutE6(MA)*/
	@Excel(name = "IoutE6(MA)", width = 15)
    @ApiModelProperty(value = "IoutE6(MA)")
    private java.lang.String ioute6;
	/**IoutE7(MA)*/
	@Excel(name = "IoutE7(MA)", width = 15)
    @ApiModelProperty(value = "IoutE7(MA)")
    private java.lang.String ioute7;
	/**IoutE8(MA)*/
	@Excel(name = "IoutE8(MA)", width = 15)
    @ApiModelProperty(value = "IoutE8(MA)")
    private java.lang.String ioute8;
	/**IoutE9(MA)*/
	@Excel(name = "IoutE9(MA)", width = 15)
    @ApiModelProperty(value = "IoutE9(MA)")
    private java.lang.String ioute9;
	/**IoutE10(MA)*/
	@Excel(name = "IoutE10(MA)", width = 15)
    @ApiModelProperty(value = "IoutE10(MA)")
    private java.lang.String ioute10;
	/**IoutE11(MA)*/
	@Excel(name = "IoutE11(MA)", width = 15)
    @ApiModelProperty(value = "IoutE11(MA)")
    private java.lang.String ioute11;
	/**IoutE12(MA)*/
	@Excel(name = "IoutE12(MA)", width = 15)
    @ApiModelProperty(value = "IoutE12(MA)")
    private java.lang.String ioute12;
	/**IoutE13(MA)*/
	@Excel(name = "IoutE13(MA)", width = 15)
    @ApiModelProperty(value = "IoutE13(MA)")
    private java.lang.String ioute13;
	/**IoutE14(MA)*/
	@Excel(name = "IoutE14(MA)", width = 15)
    @ApiModelProperty(value = "IoutE14(MA)")
    private java.lang.String ioute14;
	/**IoutE15(MA)*/
	@Excel(name = "IoutE15(MA)", width = 15)
    @ApiModelProperty(value = "IoutE15(MA)")
    private java.lang.String ioute15;
	/**IoutE_MAX(mA)*/
	@Excel(name = "IoutE_MAX(mA)", width = 15)
    @ApiModelProperty(value = "IoutE_MAX(mA)")
    private java.lang.String iouteMax;
	/**IoutE_MIN(mA)*/
	@Excel(name = "IoutE_MIN(mA)", width = 15)
    @ApiModelProperty(value = "IoutE_MIN(mA)")
    private java.lang.String iouteMin;
	/**IoutE_AVG(mA)*/
	@Excel(name = "IoutE_AVG(mA)", width = 15)
    @ApiModelProperty(value = "IoutE_AVG(mA)")
    private java.lang.String iouteAvg;
	/**DiffE_TEST(A)*/
	@Excel(name = "DiffE_TEST(A)", width = 15)
    @ApiModelProperty(value = "DiffE_TEST(A)")
    private java.lang.String diffeTest;
	/**VOUT100_OUT0(V)*/
	@Excel(name = "VOUT100_OUT0(V)", width = 15)
    @ApiModelProperty(value = "VOUT100_OUT0(V)")
    private java.lang.String vout100Out0;
	/**VOUT100_OUT1(V)*/
	@Excel(name = "VOUT100_OUT1(V)", width = 15)
    @ApiModelProperty(value = "VOUT100_OUT1(V)")
    private java.lang.String vout100Out1;
	/**VOUT100_OUT2(V)*/
	@Excel(name = "VOUT100_OUT2(V)", width = 15)
    @ApiModelProperty(value = "VOUT100_OUT2(V)")
    private java.lang.String vout100Out2;
	/**VOUT100_OUT3(V)*/
	@Excel(name = "VOUT100_OUT3(V)", width = 15)
    @ApiModelProperty(value = "VOUT100_OUT3(V)")
    private java.lang.String vout100Out3;
	/**VOUT011_OUT4(V)*/
	@Excel(name = "VOUT011_OUT4(V)", width = 15)
    @ApiModelProperty(value = "VOUT011_OUT4(V)")
    private java.lang.String vout011Out4;
	/**VOUT011_OUT5(V)*/
	@Excel(name = "VOUT011_OUT5(V)", width = 15)
    @ApiModelProperty(value = "VOUT011_OUT5(V)")
    private java.lang.String vout011Out5;
	/**VOUT011_OUT6(V)*/
	@Excel(name = "VOUT011_OUT6(V)", width = 15)
    @ApiModelProperty(value = "VOUT011_OUT6(V)")
    private java.lang.String vout011Out6;
	/**VOUT011_OUT7(V)*/
	@Excel(name = "VOUT011_OUT7(V)", width = 15)
    @ApiModelProperty(value = "VOUT011_OUT7(V)")
    private java.lang.String vout011Out7;
	/**VOUT101_OUT8(V)*/
	@Excel(name = "VOUT101_OUT8(V)", width = 15)
    @ApiModelProperty(value = "VOUT101_OUT8(V)")
    private java.lang.String vout101Out8;
	/**VOUT101_OUT9(V)*/
	@Excel(name = "VOUT101_OUT9(V)", width = 15)
    @ApiModelProperty(value = "VOUT101_OUT9(V)")
    private java.lang.String vout101Out9;
	/**VOUT101_OUT10(V)*/
	@Excel(name = "VOUT101_OUT10(V)", width = 15)
    @ApiModelProperty(value = "VOUT101_OUT10(V)")
    private java.lang.String vout101Out10;
	/**VOUT101_OUT11(V)*/
	@Excel(name = "VOUT101_OUT11(V)", width = 15)
    @ApiModelProperty(value = "VOUT101_OUT11(V)")
    private java.lang.String vout101Out11;
	/**VOUT111_OUT12(V)*/
	@Excel(name = "VOUT111_OUT12(V)", width = 15)
    @ApiModelProperty(value = "VOUT111_OUT12(V)")
    private java.lang.String vout111Out12;
	/**VOUT111_OUT13(V)*/
	@Excel(name = "VOUT111_OUT13(V)", width = 15)
    @ApiModelProperty(value = "VOUT111_OUT13(V)")
    private java.lang.String vout111Out13;
	/**VOUT111_OUT14(V)*/
	@Excel(name = "VOUT111_OUT14(V)", width = 15)
    @ApiModelProperty(value = "VOUT111_OUT14(V)")
    private java.lang.String vout111Out14;
	/**VOUT111_OUT15(V)*/
	@Excel(name = "VOUT111_OUT15(V)", width = 15)
    @ApiModelProperty(value = "VOUT111_OUT15(V)")
    private java.lang.String vout111Out15;
	/**IDout_L(mA)*/
	@Excel(name = "IDout_L(mA)", width = 15)
    @ApiModelProperty(value = "IDout_L(mA)")
    private java.lang.String idoutL;
	/**IDout_H(mA)*/
	@Excel(name = "IDout_H(mA)", width = 15)
    @ApiModelProperty(value = "IDout_H(mA)")
    private java.lang.String idoutH;
	/**GAINA0(MA)*/
	@Excel(name = "GAINA0(MA)", width = 15)
    @ApiModelProperty(value = "GAINA0(MA)")
    private java.lang.String gaina0;
	/**GAINA4(MA)*/
	@Excel(name = "GAINA4(MA)", width = 15)
    @ApiModelProperty(value = "GAINA4(MA)")
    private java.lang.String gaina4;
	/**GAINA8(MA)*/
	@Excel(name = "GAINA8(MA)", width = 15)
    @ApiModelProperty(value = "GAINA8(MA)")
    private java.lang.String gaina8;
	/**GAINA12(MA)*/
	@Excel(name = "GAINA12(MA)", width = 15)
    @ApiModelProperty(value = "GAINA12(MA)")
    private java.lang.String gaina12;
	/**GAINA_MAX(mA)*/
	@Excel(name = "GAINA_MAX(mA)", width = 15)
    @ApiModelProperty(value = "GAINA_MAX(mA)")
    private java.lang.String gainaMax;
	/**GAINA_MIN(mA)*/
	@Excel(name = "GAINA_MIN(mA)", width = 15)
    @ApiModelProperty(value = "GAINA_MIN(mA)")
    private java.lang.String gainaMin;
	/**GAINA_AVG(mA)*/
	@Excel(name = "GAINA_AVG(mA)", width = 15)
    @ApiModelProperty(value = "GAINA_AVG(mA)")
    private java.lang.String gainaAvg;
	/**GAINB1(MA)*/
	@Excel(name = "GAINB1(MA)", width = 15)
    @ApiModelProperty(value = "GAINB1(MA)")
    private java.lang.String gainb1;
	/**GAINB5(MA)*/
	@Excel(name = "GAINB5(MA)", width = 15)
    @ApiModelProperty(value = "GAINB5(MA)")
    private java.lang.String gainb5;
	/**GAINB9(MA)*/
	@Excel(name = "GAINB9(MA)", width = 15)
    @ApiModelProperty(value = "GAINB9(MA)")
    private java.lang.String gainb9;
	/**GAINB13(MA)*/
	@Excel(name = "GAINB13(MA)", width = 15)
    @ApiModelProperty(value = "GAINB13(MA)")
    private java.lang.String gainb13;
	/**GAINB_MAX(mA)*/
	@Excel(name = "GAINB_MAX(mA)", width = 15)
    @ApiModelProperty(value = "GAINB_MAX(mA)")
    private java.lang.String gainbMax;
	/**GAINB_MIN(mA)*/
	@Excel(name = "GAINB_MIN(mA)", width = 15)
    @ApiModelProperty(value = "GAINB_MIN(mA)")
    private java.lang.String gainbMin;
	/**GAINB_AVG(mA)*/
	@Excel(name = "GAINB_AVG(mA)", width = 15)
    @ApiModelProperty(value = "GAINB_AVG(mA)")
    private java.lang.String gainbAvg;
	/**GAINC2(MA)*/
	@Excel(name = "GAINC2(MA)", width = 15)
    @ApiModelProperty(value = "GAINC2(MA)")
    private java.lang.String gainc2;
	/**GAINC6(MA)*/
	@Excel(name = "GAINC6(MA)", width = 15)
    @ApiModelProperty(value = "GAINC6(MA)")
    private java.lang.String gainc6;
	/**GAINC10(MA)*/
	@Excel(name = "GAINC10(MA)", width = 15)
    @ApiModelProperty(value = "GAINC10(MA)")
    private java.lang.String gainc10;
	/**GAINC14(MA)*/
	@Excel(name = "GAINC14(MA)", width = 15)
    @ApiModelProperty(value = "GAINC14(MA)")
    private java.lang.String gainc14;
	/**GAINC_MAX(mA)*/
	@Excel(name = "GAINC_MAX(mA)", width = 15)
    @ApiModelProperty(value = "GAINC_MAX(mA)")
    private java.lang.String gaincMax;
	/**GAINC_MIN(mA)*/
	@Excel(name = "GAINC_MIN(mA)", width = 15)
    @ApiModelProperty(value = "GAINC_MIN(mA)")
    private java.lang.String gaincMin;
	/**GAINC_AVG(mA)*/
	@Excel(name = "GAINC_AVG(mA)", width = 15)
    @ApiModelProperty(value = "GAINC_AVG(mA)")
    private java.lang.String gaincAvg;
	/**GAIND3(MA)*/
	@Excel(name = "GAIND3(MA)", width = 15)
    @ApiModelProperty(value = "GAIND3(MA)")
    private java.lang.String gaind3;
	/**GAIND7(MA)*/
	@Excel(name = "GAIND7(MA)", width = 15)
    @ApiModelProperty(value = "GAIND7(MA)")
    private java.lang.String gaind7;
	/**GAIND11(MA)*/
	@Excel(name = "GAIND11(MA)", width = 15)
    @ApiModelProperty(value = "GAIND11(MA)")
    private java.lang.String gaind11;
	/**GAIND15(MA)*/
	@Excel(name = "GAIND15(MA)", width = 15)
    @ApiModelProperty(value = "GAIND15(MA)")
    private java.lang.String gaind15;
	/**GAIND_MAX(mA)*/
	@Excel(name = "GAIND_MAX(mA)", width = 15)
    @ApiModelProperty(value = "GAIND_MAX(mA)")
    private java.lang.String gaindMax;
	/**GAIND_MIN(mA)*/
	@Excel(name = "GAIND_MIN(mA)", width = 15)
    @ApiModelProperty(value = "GAIND_MIN(mA)")
    private java.lang.String gaindMin;
	/**GAIND_AVG(mA)*/
	@Excel(name = "GAIND_AVG(mA)", width = 15)
    @ApiModelProperty(value = "GAIND_AVG(mA)")
    private java.lang.String gaindAvg;
	/**ON_LEAKAGE_OUT0(nA)*/
	@Excel(name = "ON_LEAKAGE_OUT0(nA)", width = 15)
    @ApiModelProperty(value = "ON_LEAKAGE_OUT0(nA)")
    private java.lang.String onLeakageOut0;
	/**ON_LEAKAGE_OUT1(nA)*/
	@Excel(name = "ON_LEAKAGE_OUT1(nA)", width = 15)
    @ApiModelProperty(value = "ON_LEAKAGE_OUT1(nA)")
    private java.lang.String onLeakageOut1;
	/**ON_LEAKAGE_OUT2(nA)*/
	@Excel(name = "ON_LEAKAGE_OUT2(nA)", width = 15)
    @ApiModelProperty(value = "ON_LEAKAGE_OUT2(nA)")
    private java.lang.String onLeakageOut2;
	/**ON_LEAKAGE_OUT3(nA)*/
	@Excel(name = "ON_LEAKAGE_OUT3(nA)", width = 15)
    @ApiModelProperty(value = "ON_LEAKAGE_OUT3(nA)")
    private java.lang.String onLeakageOut3;
	/**ON_LEAKAGE_OUT4(nA)*/
	@Excel(name = "ON_LEAKAGE_OUT4(nA)", width = 15)
    @ApiModelProperty(value = "ON_LEAKAGE_OUT4(nA)")
    private java.lang.String onLeakageOut4;
	/**ON_LEAKAGE_OUT5(nA)*/
	@Excel(name = "ON_LEAKAGE_OUT5(nA)", width = 15)
    @ApiModelProperty(value = "ON_LEAKAGE_OUT5(nA)")
    private java.lang.String onLeakageOut5;
	/**ON_LEAKAGE_OUT6(nA)*/
	@Excel(name = "ON_LEAKAGE_OUT6(nA)", width = 15)
    @ApiModelProperty(value = "ON_LEAKAGE_OUT6(nA)")
    private java.lang.String onLeakageOut6;
	/**ON_LEAKAGE_OUT7(nA)*/
	@Excel(name = "ON_LEAKAGE_OUT7(nA)", width = 15)
    @ApiModelProperty(value = "ON_LEAKAGE_OUT7(nA)")
    private java.lang.String onLeakageOut7;
	/**ON_LEAKAGE_OUT8(nA)*/
	@Excel(name = "ON_LEAKAGE_OUT8(nA)", width = 15)
    @ApiModelProperty(value = "ON_LEAKAGE_OUT8(nA)")
    private java.lang.String onLeakageOut8;
	/**ON_LEAKAGE_OUT9(nA)*/
	@Excel(name = "ON_LEAKAGE_OUT9(nA)", width = 15)
    @ApiModelProperty(value = "ON_LEAKAGE_OUT9(nA)")
    private java.lang.String onLeakageOut9;
	/**ON_LEAKAGE_OUT10(nA)*/
	@Excel(name = "ON_LEAKAGE_OUT10(nA)", width = 15)
    @ApiModelProperty(value = "ON_LEAKAGE_OUT10(nA)")
    private java.lang.String onLeakageOut10;
	/**ON_LEAKAGE_OUT11(nA)*/
	@Excel(name = "ON_LEAKAGE_OUT11(nA)", width = 15)
    @ApiModelProperty(value = "ON_LEAKAGE_OUT11(nA)")
    private java.lang.String onLeakageOut11;
	/**ON_LEAKAGE_OUT12(nA)*/
	@Excel(name = "ON_LEAKAGE_OUT12(nA)", width = 15)
    @ApiModelProperty(value = "ON_LEAKAGE_OUT12(nA)")
    private java.lang.String onLeakageOut12;
	/**ON_LEAKAGE_OUT13(nA)*/
	@Excel(name = "ON_LEAKAGE_OUT13(nA)", width = 15)
    @ApiModelProperty(value = "ON_LEAKAGE_OUT13(nA)")
    private java.lang.String onLeakageOut13;
	/**ON_LEAKAGE_OUT14(nA)*/
	@Excel(name = "ON_LEAKAGE_OUT14(nA)", width = 15)
    @ApiModelProperty(value = "ON_LEAKAGE_OUT14(nA)")
    private java.lang.String onLeakageOut14;
	/**ON_LEAKAGE_OUT15(nA)*/
	@Excel(name = "ON_LEAKAGE_OUT15(nA)", width = 15)
    @ApiModelProperty(value = "ON_LEAKAGE_OUT15(nA)")
    private java.lang.String onLeakageOut15;
	/**OFF_LEAKAGE_OUT0(uA)*/
	@Excel(name = "OFF_LEAKAGE_OUT0(uA)", width = 15)
    @ApiModelProperty(value = "OFF_LEAKAGE_OUT0(uA)")
    private java.lang.String offLeakageOut0;
	/**OFF_LEAKAGE_OUT1(uA)*/
	@Excel(name = "OFF_LEAKAGE_OUT1(uA)", width = 15)
    @ApiModelProperty(value = "OFF_LEAKAGE_OUT1(uA)")
    private java.lang.String offLeakageOut1;
	/**OFF_LEAKAGE_OUT2(uA)*/
	@Excel(name = "OFF_LEAKAGE_OUT2(uA)", width = 15)
    @ApiModelProperty(value = "OFF_LEAKAGE_OUT2(uA)")
    private java.lang.String offLeakageOut2;
	/**OFF_LEAKAGE_OUT3(uA)*/
	@Excel(name = "OFF_LEAKAGE_OUT3(uA)", width = 15)
    @ApiModelProperty(value = "OFF_LEAKAGE_OUT3(uA)")
    private java.lang.String offLeakageOut3;
	/**OFF_LEAKAGE_OUT4(uA)*/
	@Excel(name = "OFF_LEAKAGE_OUT4(uA)", width = 15)
    @ApiModelProperty(value = "OFF_LEAKAGE_OUT4(uA)")
    private java.lang.String offLeakageOut4;
	/**OFF_LEAKAGE_OUT5(uA)*/
	@Excel(name = "OFF_LEAKAGE_OUT5(uA)", width = 15)
    @ApiModelProperty(value = "OFF_LEAKAGE_OUT5(uA)")
    private java.lang.String offLeakageOut5;
	/**OFF_LEAKAGE_OUT6(uA)*/
	@Excel(name = "OFF_LEAKAGE_OUT6(uA)", width = 15)
    @ApiModelProperty(value = "OFF_LEAKAGE_OUT6(uA)")
    private java.lang.String offLeakageOut6;
	/**OFF_LEAKAGE_OUT7(uA)*/
	@Excel(name = "OFF_LEAKAGE_OUT7(uA)", width = 15)
    @ApiModelProperty(value = "OFF_LEAKAGE_OUT7(uA)")
    private java.lang.String offLeakageOut7;
	/**OFF_LEAKAGE_OUT8(uA)*/
	@Excel(name = "OFF_LEAKAGE_OUT8(uA)", width = 15)
    @ApiModelProperty(value = "OFF_LEAKAGE_OUT8(uA)")
    private java.lang.String offLeakageOut8;
	/**OFF_LEAKAGE_OUT9(uA)*/
	@Excel(name = "OFF_LEAKAGE_OUT9(uA)", width = 15)
    @ApiModelProperty(value = "OFF_LEAKAGE_OUT9(uA)")
    private java.lang.String offLeakageOut9;
	/**OFF_LEAKAGE_OUT10(uA)*/
	@Excel(name = "OFF_LEAKAGE_OUT10(uA)", width = 15)
    @ApiModelProperty(value = "OFF_LEAKAGE_OUT10(uA)")
    private java.lang.String offLeakageOut10;
	/**OFF_LEAKAGE_OUT11(uA)*/
	@Excel(name = "OFF_LEAKAGE_OUT11(uA)", width = 15)
    @ApiModelProperty(value = "OFF_LEAKAGE_OUT11(uA)")
    private java.lang.String offLeakageOut11;
	/**OFF_LEAKAGE_OUT12(uA)*/
	@Excel(name = "OFF_LEAKAGE_OUT12(uA)", width = 15)
    @ApiModelProperty(value = "OFF_LEAKAGE_OUT12(uA)")
    private java.lang.String offLeakageOut12;
	/**OFF_LEAKAGE_OUT13(uA)*/
	@Excel(name = "OFF_LEAKAGE_OUT13(uA)", width = 15)
    @ApiModelProperty(value = "OFF_LEAKAGE_OUT13(uA)")
    private java.lang.String offLeakageOut13;
	/**OFF_LEAKAGE_OUT14(uA)*/
	@Excel(name = "OFF_LEAKAGE_OUT14(uA)", width = 15)
    @ApiModelProperty(value = "OFF_LEAKAGE_OUT14(uA)")
    private java.lang.String offLeakageOut14;
	/**OFF_LEAKAGE_OUT15(uA)*/
	@Excel(name = "OFF_LEAKAGE_OUT15(uA)", width = 15)
    @ApiModelProperty(value = "OFF_LEAKAGE_OUT15(uA)")
    private java.lang.String offLeakageOut15;
	/**ICC1_TEST(mA)*/
	@Excel(name = "ICC1_TEST(mA)", width = 15)
    @ApiModelProperty(value = "ICC1_TEST(mA)")
    private java.lang.String icc1Test;
	/**ICC2_TEST(mA)*/
	@Excel(name = "ICC2_TEST(mA)", width = 15)
    @ApiModelProperty(value = "ICC2_TEST(mA)")
    private java.lang.String icc2Test;
	/**ICC3_TEST(mA)*/
	@Excel(name = "ICC3_TEST(mA)", width = 15)
    @ApiModelProperty(value = "ICC3_TEST(mA)")
    private java.lang.String icc3Test;
	/**ICC4_TEST(mA)*/
	@Excel(name = "ICC4_TEST(mA)", width = 15)
    @ApiModelProperty(value = "ICC4_TEST(mA)")
    private java.lang.String icc4Test;
	/**IDD_TEST(mA)*/
	@Excel(name = "IDD_TEST(mA)", width = 15)
    @ApiModelProperty(value = "IDD_TEST(mA)")
    private java.lang.String iddTest;
	/**PRE_DRV_A_TEST_OUT0(V)*/
	@Excel(name = "PRE_DRV_A_TEST_OUT0(V)", width = 15)
    @ApiModelProperty(value = "PRE_DRV_A_TEST_OUT0(V)")
    private java.lang.String preDrvATestOut0;
	/**PRE_DRV_A_TEST_OUT1(V)*/
	@Excel(name = "PRE_DRV_A_TEST_OUT1(V)", width = 15)
    @ApiModelProperty(value = "PRE_DRV_A_TEST_OUT1(V)")
    private java.lang.String preDrvATestOut1;
	/**PRE_DRV_A_TEST_OUT2(V)*/
	@Excel(name = "PRE_DRV_A_TEST_OUT2(V)", width = 15)
    @ApiModelProperty(value = "PRE_DRV_A_TEST_OUT2(V)")
    private java.lang.String preDrvATestOut2;
	/**PRE_DRV_A_TEST_OUT3(V)*/
	@Excel(name = "PRE_DRV_A_TEST_OUT3(V)", width = 15)
    @ApiModelProperty(value = "PRE_DRV_A_TEST_OUT3(V)")
    private java.lang.String preDrvATestOut3;
	/**PRE_DRV_B_TEST_OUT4(V)*/
	@Excel(name = "PRE_DRV_B_TEST_OUT4(V)", width = 15)
    @ApiModelProperty(value = "PRE_DRV_B_TEST_OUT4(V)")
    private java.lang.String preDrvBTestOut4;
	/**PRE_DRV_B_TEST_OUT5(V)*/
	@Excel(name = "PRE_DRV_B_TEST_OUT5(V)", width = 15)
    @ApiModelProperty(value = "PRE_DRV_B_TEST_OUT5(V)")
    private java.lang.String preDrvBTestOut5;
	/**PRE_DRV_B_TEST_OUT6(V)*/
	@Excel(name = "PRE_DRV_B_TEST_OUT6(V)", width = 15)
    @ApiModelProperty(value = "PRE_DRV_B_TEST_OUT6(V)")
    private java.lang.String preDrvBTestOut6;
	/**PRE_DRV_B_TEST_OUT7(V)*/
	@Excel(name = "PRE_DRV_B_TEST_OUT7(V)", width = 15)
    @ApiModelProperty(value = "PRE_DRV_B_TEST_OUT7(V)")
    private java.lang.String preDrvBTestOut7;
	/**PRE_DRV_C_TEST_OUT8(V)*/
	@Excel(name = "PRE_DRV_C_TEST_OUT8(V)", width = 15)
    @ApiModelProperty(value = "PRE_DRV_C_TEST_OUT8(V)")
    private java.lang.String preDrvCTestOut8;
	/**PRE_DRV_C_TEST_OUT9(V)*/
	@Excel(name = "PRE_DRV_C_TEST_OUT9(V)", width = 15)
    @ApiModelProperty(value = "PRE_DRV_C_TEST_OUT9(V)")
    private java.lang.String preDrvCTestOut9;
	/**PRE_DRV_C_TEST_OUT10(V)*/
	@Excel(name = "PRE_DRV_C_TEST_OUT10(V)", width = 15)
    @ApiModelProperty(value = "PRE_DRV_C_TEST_OUT10(V)")
    private java.lang.String preDrvCTestOut10;
	/**PRE_DRV_C_TEST_OUT11(V)*/
	@Excel(name = "PRE_DRV_C_TEST_OUT11(V)", width = 15)
    @ApiModelProperty(value = "PRE_DRV_C_TEST_OUT11(V)")
    private java.lang.String preDrvCTestOut11;
	/**PRE_DRV_D_TEST_OUT12(V)*/
	@Excel(name = "PRE_DRV_D_TEST_OUT12(V)", width = 15)
    @ApiModelProperty(value = "PRE_DRV_D_TEST_OUT12(V)")
    private java.lang.String preDrvDTestOut12;
	/**PRE_DRV_D_TEST_OUT13(V)*/
	@Excel(name = "PRE_DRV_D_TEST_OUT13(V)", width = 15)
    @ApiModelProperty(value = "PRE_DRV_D_TEST_OUT13(V)")
    private java.lang.String preDrvDTestOut13;
	/**PRE_DRV_D_TEST_OUT14(V)*/
	@Excel(name = "PRE_DRV_D_TEST_OUT14(V)", width = 15)
    @ApiModelProperty(value = "PRE_DRV_D_TEST_OUT14(V)")
    private java.lang.String preDrvDTestOut14;
	/**PRE_DRV_D_TEST_OUT15(V)*/
	@Excel(name = "PRE_DRV_D_TEST_OUT15(V)", width = 15)
    @ApiModelProperty(value = "PRE_DRV_D_TEST_OUT15(V)")
    private java.lang.String preDrvDTestOut15;
	/**GAOYA_1(V)*/
	@Excel(name = "GAOYA_1(V)", width = 15)
    @ApiModelProperty(value = "GAOYA_1(V)")
    private java.lang.String gaoya1;
	/**GAOYA_2(V)*/
	@Excel(name = "GAOYA_2(V)", width = 15)
    @ApiModelProperty(value = "GAOYA_2(V)")
    private java.lang.String gaoya2;
	/**ICC_SLM1(mA)*/
	@Excel(name = "ICC_SLM1(mA)", width = 15)
    @ApiModelProperty(value = "ICC_SLM1(mA)")
    private java.lang.String iccSlm1;
	/**V_REXT_H_A(V)*/
	@Excel(name = "V_REXT_H_A(V)", width = 15)
    @ApiModelProperty(value = "V_REXT_H_A(V)")
    private java.lang.String vRextHA;
	/**V_REXT_H_B(V)*/
	@Excel(name = "V_REXT_H_B(V)", width = 15)
    @ApiModelProperty(value = "V_REXT_H_B(V)")
    private java.lang.String vRextHB;
	/**V_REXT_H_C(V)*/
	@Excel(name = "V_REXT_H_C(V)", width = 15)
    @ApiModelProperty(value = "V_REXT_H_C(V)")
    private java.lang.String vRextHC;
	/**V_REXT_H_0(V)*/
	@Excel(name = "V_REXT_H_0(V)", width = 15)
    @ApiModelProperty(value = "V_REXT_H_0(V)")
    private java.lang.String vRextH0;
	/**V_REXT_H_01(V)*/
	@Excel(name = "V_REXT_H_01(V)", width = 15)
    @ApiModelProperty(value = "V_REXT_H_01(V)")
    private java.lang.String vRextH01;
	/**备用字段01*/
	@Excel(name = "备用字段01", width = 15)
    @ApiModelProperty(value = "备用字段01")
    private java.lang.String extra01;
	/**备用字段02*/
	@Excel(name = "备用字段02", width = 15)
    @ApiModelProperty(value = "备用字段02")
    private java.lang.String extra02;
	/**备用字段03*/
	@Excel(name = "备用字段03", width = 15)
    @ApiModelProperty(value = "备用字段03")
    private java.lang.String extra03;
	/**备用字段04*/
	@Excel(name = "备用字段04", width = 15)
    @ApiModelProperty(value = "备用字段04")
    private java.lang.String extra04;
	/**备用字段05*/
	@Excel(name = "备用字段05", width = 15)
    @ApiModelProperty(value = "备用字段05")
    private java.lang.String extra05;
	/**备用字段06*/
	@Excel(name = "备用字段06", width = 15)
    @ApiModelProperty(value = "备用字段06")
    private java.lang.String extra06;
	/**备用字段07*/
	@Excel(name = "备用字段07", width = 15)
    @ApiModelProperty(value = "备用字段07")
    private java.lang.String extra07;
	/**备用字段08*/
	@Excel(name = "备用字段08", width = 15)
    @ApiModelProperty(value = "备用字段08")
    private java.lang.String extra08;
	/**备用字段09*/
	@Excel(name = "备用字段09", width = 15)
    @ApiModelProperty(value = "备用字段09")
    private java.lang.String extra09;
	/**备用字段10*/
	@Excel(name = "备用字段10", width = 15)
    @ApiModelProperty(value = "备用字段10")
    private java.lang.String extra10;
}
