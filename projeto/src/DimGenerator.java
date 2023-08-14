public class DimGenerator {
    private String var_type;
    private String var1;
    private String var_suf;
    private String class_name;
    private Object value1;

    public DimGenerator(String class_name, String var1, String var_type) {
        this.var_type = var_type;
        this.var1 = var1;
        this.class_name = class_name;
    }

    public DimGenerator(String class_name, String var1, String var_type, Object value1) {
        this.var_type = var_type;
        this.var1 = var1;
        this.class_name = class_name;
        this.value1 = value1;
    }

    public DimGenerator(String class_name, String var1, String var_type, String var_suf) {
        this.var_type = var_type;
        this.var1 = var1;
        this.class_name = class_name;
        this.var_suf = var_suf;
    }

    public DimGenerator(String class_name, String var1, String var_type, Object value1, String var_suf) {
        this.var_type = var_type;
        this.var1 = var1;
        this.class_name = class_name;
        this.value1 = value1;
        this.var_suf = var_suf;
    }

    public String getVar_type() {
        return var_type;
    }

    public String getVar1() {
        return var1;
    }

    public String getClass_name() {
        return class_name;
    }

    public Object getValue1() {
        return value1;
    }

    public String getVar_suf() {
        return var_suf;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }
    public void setVar1(String var1) {
        this.var1 = var1;
    }
    public void setValue1(Object value1) {
        this.value1 = value1;
    }

    @Override
    public String toString() {
        if (value1 != null && var_suf != null)
            return var1 + "[" + var_suf + "]" + " (" + var_type + ") = " + value1;
        else if (value1 != null && var_suf == null) {
            return var1 + " (" + var_type + ") = " + value1;
        } else {
            return var1 + " (" + var_type + ")";
        }

    }
}