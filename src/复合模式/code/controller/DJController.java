package 复合模式.code.controller;

import 复合模式.code.model.DJModel;
import 复合模式.code.view.DJView;

public class DJController {
    DJModel djModel;
    DJView djView;

    public DJController(DJModel djModel) {
        this.djModel = djModel;
        djView = new DJView(this, djModel);
    }

    public void setBPM(int bpm){
        djModel.setBPM(bpm);
    }

}