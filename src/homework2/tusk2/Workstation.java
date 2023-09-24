package homework2.tusk2;

import lombok.NoArgsConstructor;

@NoArgsConstructor
class Workstation extends Laptop {
    public void processor() {
        System.out.println("часто має топові по продуктивності рішення");
    }

    public void monitor() {
        System.out.println("зазвичай має великий окремий монітор");
    }
    public void battery(){
        System.out.println("батарея відсутня або знаходиться окремо ");
    }
    public void gpu() {
        System.out.println(GPU.NVIDIA);
    }
}