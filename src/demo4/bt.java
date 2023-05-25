package demo4;

public class bt {
    int ts;
    int ms;

    public bt(){

    }
    public bt(int a, int b){
        this.ts = a;
        this.ms = b;
    }
    public int getTs() {
        return ts;
    }

    public void setTs(int ts) {
        this.ts = ts;
    }

    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    public void phanSo(){
        if(ts * ms < 0){
            System.out.println("-" + Math.abs(ts)+ Math.abs(ms));
        }else {
            System.out.println( Math.abs(ts)+ Math.abs(ms));
        }
    }

    public void rutGon(){
        int ucln=1;
        ts=ts/ucln;
        ms=ms/ucln;
        System.out.println(ts+"/"+ms);
    }
    public void inverse(){
        int nd = ts;
        ts = ms;
        ms = nd;
        System.out.println(ts+"/"+ms);
    }


    public bt add(bt ps2){
        bt kq = new bt();
        kq.ts=this.ts*ps2.ms+ps2.ms*this.ts;
        kq.ms=this.ms*ps2.ms;
        System.out.println(kq.ts+"/"+kq.ms);
        return kq;

    }

    public bt sub(bt ps2) {
        bt kq = new bt();
        kq.ts=this.ts*ps2.ms-ps2.ts*this.ms;
        kq.ms=this.ms*ps2.ms;
        System.out.println(kq.ts+"/"+kq.ms);
        return kq;
    }

    public bt nul(bt ps2) {
        bt kq = new bt();
        kq.ts=this.ts*ps2.ts;
        kq.ms=this.ms*ps2.ms;
        System.out.println(kq.ts+"/"+kq.ms);
        return kq;
    }
    public bt div(bt ps2) {
        bt kq = new bt();
        kq.ts=this.ts*ps2.ms;
        kq.ms=this.ms*ps2.ts;
        System.out.println(kq.ts+"/"+kq.ms);
        return kq;
    }
}
