package homework2.tusk2;

import lombok.NoArgsConstructor;

@NoArgsConstructor
class Laptop extends PC implements Battery {
    public void processor() {
        System.out.println("процессор збалансований між економією енергії та продуктивністью");
    }

    public void monitor() {
        System.out.println("монітор доволі тонкий та являється нерозбірною кришкою лаптопа");
    }

    public void battery() {
        System.out.println("має досить потужну батарею");
    }
    public void gpu() {
        System.out.println(GPU.AMD);
    }

}
