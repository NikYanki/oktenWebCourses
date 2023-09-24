package homework2.tusk2;

import lombok.NoArgsConstructor;

@NoArgsConstructor
class UltraBook extends PC implements Battery {
    public void processor() {
        System.out.println("процессор спрямований більше на енергозбереження");
    }

    public void monitor() {
        System.out.println("монітор являється нерозбірною кришкою лаптопа, ствотений в найтоншій репрезентації");
    }

    public void battery() {
        System.out.println("має компактну інтегровану батарею");
    }
    public void gpu() {
        System.out.println(GPU.INTEL);
    }
}