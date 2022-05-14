

// CLASE CREA TEMPORIZADOR EN SEGUNDOS : 
// Se indica tiempo que estara activo
// setRunTimer(2); // 2 SEGUNDOS ACTIVO  - ALTO > BAJO


package mylibrary.TimerSeconds;

import processing.core.*;


public class TemporizadorSeconds {
	
	// myParent is a reference to the parent sketch
	PApplet myParent;
	
    boolean           activeTimer = false ;   // Activa cuenta
    int            secondsCounter = 0 ;       // Cuenta segundos Transcurrido
    int             captureSecond = 0 ;       // Captura tiempo inicial millis()
    int                secondsMax = 0 ;       // Tiempo maximo , para desactivar


	public TemporizadorSeconds(PApplet theParent) {
		
		// INITIALIZE
		myParent = theParent;
		
        // MENSAJE LIBRERIA 
        System.out.println("Load Library Simon : Clase Temporizador en Segundos / 13-may-2022 / 0-02" );
		
		
	}
	
    // draw();
    public void timer(){

         if( activeTimer == true ){
               
               if( counterTimer() == secondsMax ){

                   activeTimer = false ;

               }
         }
    }
    
    // -----------------------------------------------------------
    public boolean getState(){
          
          return activeTimer ;

    }
    
    public void setRunTimer( int timeEnd ){

        // Activa timer
        activeTimer     = true ;

        // Inicializa contador segundos 
        secondsCounter  = 0 ;

        // Conocemos tiempo de partida 
        captureSecond   = millisSeconds();

        // Tiempo para finalizar
        secondsMax      = timeEnd ;

    }

    public int millisSeconds(){

        return (int)( myParent.millis()/1000 );

    }
     
    public int counterTimer(){

        return ( millisSeconds() - captureSecond );

    }
	
    
}

