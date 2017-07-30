package task6;



@About(author = "Bakhar Veniamin")
 class AtomicBoat {



    AtomicBoat(){
        EngineForAtomicBoat engine = new EngineForAtomicBoat();
        engine.Run();
    }


    private class EngineForAtomicBoat{
        void Run() {
            System.out.println("Двигатель запущен");
        }
    }
}
