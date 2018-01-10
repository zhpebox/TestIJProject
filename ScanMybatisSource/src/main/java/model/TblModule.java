package model;

public class TblModule {
    private Integer module_id;

    private String file_name;

    private String file_header;

    private String module_name;

    private String module_text;

    /*setter and getter*/

    public Integer getModule_id() {
        return module_id;
    }

    public void setModule_id(Integer module_id) {
        this.module_id = module_id;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getFile_header() {
        return file_header;
    }

    public void setFile_header(String file_header) {
        this.file_header = file_header;
    }

    public String getModule_name() {
        return module_name;
    }

    public void setModule_name(String module_name) {
        this.module_name = module_name;
    }

    public String getModule_text() {
        return module_text;
    }

    public void setModule_text(String module_text) {
        this.module_text = module_text;
    }

    @Override
    public String toString() {
        return "TblModule{" +
                "module_id=" + module_id +
                ", file_name='" + file_name + '\'' +
                ", file_header='" + file_header + '\'' +
                ", module_name='" + module_name + '\'' +
                ", module_text='" + module_text + '\'' +
                '}';
    }
}