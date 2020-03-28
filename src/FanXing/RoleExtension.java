package FanXing;

import java.util.List;

public class RoleExtension extends RoleBasic {
    private List<String> addPerNames;
    private List<String> deletePerNames;
    private List<Integer> addPerIds;
    private List<Integer> deletePerIds;
    private List<String>  perNames;

    public List<String> getPerNames() {
        return perNames;
    }
    public void setPerNames(List<String> perNames) {
        this.perNames = perNames;
    }

    public List<String> getAddPerNames() {
        return addPerNames;
    }

    public void setAddPerNames(List<String> addPerNames) {
        this.addPerNames = addPerNames;
    }

    public List<String> getDeletePerNames() {
        return deletePerNames;
    }

    public void setDeletePerNames(List<String> deletePerNames) {
        this.deletePerNames = deletePerNames;
    }

    public List<Integer> getAddPerIds() {
        return addPerIds;
    }

    public void setAddPerIds(List<Integer> addPerIds) {
        this.addPerIds = addPerIds;
    }

    public List<Integer> getDeletePerIds() {
        return deletePerIds;
    }

    public void setDeletePerIds(List<Integer> deletePerIds) {
        this.deletePerIds = deletePerIds;
    }
}
