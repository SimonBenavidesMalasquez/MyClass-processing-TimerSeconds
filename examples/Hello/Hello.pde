import mylibrary.TimerSeconds.*; 
 
TemporizadorSeconds timerSeconds;

void setup() {
 
     size(400,400);

     // CLASE TEMPORIZADOR : 
     timerSeconds = new TemporizadorSeconds(this);

}

void draw() {
 
    background(0);

    // desactiva cuenta : 
    timerSeconds.timer();
 
    // Usamos estado : 
    if( timerSeconds.getState() == true ){
       
       background(0,60,0);

    }else{

       background(0);
    }

}

void mousePressed(){

   // Activo 4 segundos : 
   timerSeconds.setRunTimer(4); 

}




