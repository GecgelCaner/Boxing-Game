public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1 , Fighter f2 , int minWeight , int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }



    void run(){
        if(isCheck()){

            while(this.f1.health > 0 && this.f2.health > 0){

                System.out.println("========= YENİ ROUND =========");

                if(isFirst()){
                    this.f2.health = this.f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                    this.f1.health = this.f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                }else {
                    this.f1.health = this.f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                    this.f2.health = this.f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                }

                System.out.println(this.f1.name + " Sağlık :" + this.f1.health);
                System.out.println(this.f2.name + " Sağlık :" + this.f2.health);

            }
        }else {
            System.out.println("Boksörlerin sikletleri farklıdır.");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >=minWeight && this.f2.weight <= maxWeight );
    }

    boolean isWin(){
        if (this.f1.health == 0){
            System.out.println(this.f2.name + " kazandı ! ");
        }
        if(this.f2.health == 0){
            System.out.println(this.f1.name + " kazandı ! ");
        }

        return false;
    }

    boolean isFirst(){
        double randomFirst = Math.random()*100;
        if(randomFirst >= 50){
            return false;
        }else {
            return true;
        }
    }
}
