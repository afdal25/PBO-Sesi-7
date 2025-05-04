/* Mochamad Afdal,
   20230040323,
   Soal Nomor 1
 */

public class Mahasiswa<T1, T2, T3> {
    private T1 nim;
    private T2 name;
    private T3 clas;

    public T1 getNim() {
        return nim;
    }

    public void setNim(T1 nim) {
        this.nim = nim;
    }

    public T2 getName() {
        return name;
    }

    public void setName(T2 name) {
        this.name = name;
    }

    public T3 getClas() {
        return clas;
    }

    public void setClas(T3 clas) {
        this.clas = clas;
    }
}