package top.defaults.camera;

import android.util.Log;

public class PhotographerHelper {

    private Photographer photographer;

    public PhotographerHelper(Photographer photographer) {
        this.photographer = photographer;
    }

    public void switchMode() {

        int newMode = (photographer.getMode() == Values.MODE_IMAGE ? Values.MODE_IMAGE : Values.MODE_VIDEO);
        Log.d("KDH Swith code :",String.valueOf(newMode));
        photographer.setMode(newMode);
    }

    public void flip() {
        int newFacing = (photographer.getFacing() == Values.FACING_BACK ? Values.FACING_FRONT : Values.FACING_BACK);
        photographer.setFacing(newFacing);
    }

    public void moremenu(){

    }
    public void control(){

    }
    public void setFileDir(String fileDir) {
        Utils.setFileDir(fileDir);
    }
}
