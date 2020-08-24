package 复合模式.code.model;

/**
 * @description: 节拍模型
 * @author: zhangys
 * @create: 2020-08-24 14:25
 **/
public interface BeatModelInterface {

    void initialize();

    void on();

    void off();

    void setBPM(int bpm);

    int getBPM();

    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);

}
