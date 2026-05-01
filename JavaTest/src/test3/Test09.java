package test3;

class CPU {
    private String name;
    private double hz;

    // 코드 작성하기
    public CPU(String name, double hz) {
    	this.name = name;
    	this.hz = hz;
    }
    
    public String getInfo() {
        return name + "(" + hz + "GHz)";
    }
}

class RAM {
    private String name;
    private int capacity;

	// 코드 작성하기
    public RAM(String name, int capacity) {
    	this.name = name;
    	this.capacity = capacity;
    }
    
    public String getInfo() {
        return name + " " + capacity + "GB";
    }
}

class GPU {
    private String name;
    private int memory;
    
    // 코드 작성하기
    public GPU(String name, int memory) {
    	this.name = name;
    	this.memory = memory;
    }
    
    
    public String getInfo() { return name + " VRAM " + memory + "GB"; }
}

class SSD {
    private String name;
    private int capacity;
    
    // 코드 작성하기
    public SSD(String name, int capacity) {
    	this.name = name;
    	this.capacity = capacity;
    }
    
    public String getInfo() { return name + " " + capacity + "GB"; }
}

class Laptop {
    private String brand;
    private CPU cpu;
    private RAM ram;
    private GPU gpu;
    private SSD ssd;

    // 코드 작성하기
    public Laptop(String brand, CPU cpu, RAM ram, GPU gpu, SSD ssd) {
    
    	this.brand = brand;
    	this.cpu = cpu;
    	this.ram = ram;
    	this.gpu = gpu;
    	this.ssd = ssd;
    }
    

    public void info() {
        System.out.println("--------------------------");
        System.out.println("제조사 : " + this.brand);
        System.out.println("CPU 정보 : " + cpu.getInfo());
        System.out.println("RAM 정보 : " + ram.getInfo());
        System.out.println("GPU 정보 : " + gpu.getInfo());
        System.out.println("SSD 정보 : " + ssd.getInfo());
        System.out.println("--------------------------");
    }
}

public class Test09 {
    public static void main(String[] args) {        
        CPU cpu = new CPU("AMD 라이젠7 9800X3D", 4.7);
        RAM ram = new RAM("삼성 DDR5", 32);
        GPU gpu = new GPU("RTX 5080", 16);
        SSD ssd = new SSD("SK하이닉스 Gold P31", 500);
        
        Laptop macbook = new Laptop("Apple MacBook Pro", cpu, ram, gpu, ssd);
        macbook.info();
    }
}





