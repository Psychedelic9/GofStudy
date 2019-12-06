package state;

public class Context {
    State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void playVideo(){
        state.playVideo();
    }
    public void showTxt(){
        state.showTxt();
    }
}
