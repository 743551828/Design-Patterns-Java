package 命令模式.code.enums;

public enum Volume {

    HIGH(100,"高"),
    MIDDLE(60,"中"),
    DOWN(20,"低");

    public Integer num;

    public String des;

    Volume(Integer num, String des){
        this.num = num;
        this.des = des;
    }

    public static Volume getHighVolume(Volume volume){
        switch (volume.num){
            case 100:
            case 60:
                return Volume.HIGH;
            case 20:
                return Volume.MIDDLE;
        }
        return null;
    }

    public static Volume getLowVolume(Volume volume){
        switch (volume.num){
            case 100:
                return Volume.MIDDLE;
            case 60:
            case 20:
                return Volume.DOWN;
        }
        return null;
    }

}
