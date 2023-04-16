package org.jeecg.modules.xtw.model;

import lombok.Data;

@Data
public class JimuDictModel {

    /** 字典显示名 */
    private String text;

    /** 字典值 */
    private String value;

    /** 字典类型
     *  tilte = text
     */
    public String getTitle() {
        return text;
    }

    public void setTitle(String title) {
        this.text = title;
    }
}
