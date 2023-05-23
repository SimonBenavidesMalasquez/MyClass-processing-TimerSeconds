
// -------------------------------------------------------------------------------------------------------------
//  FUNCIONAMIENTO :  ESTADO DE ONDA CUADRADA : ALTO Y BAJO EN BUCLE
// -------------------------------------------------------------------------------------------------------------

// set_tON_tOFF( 1000, 1000 );    // TIEMPO ALTO  Y TIEMPO BAJO ( ms )


package mylibrary.TimerSeconds_LED_ON_OFF;

import processing.core.*;


public class TemporizadorLED_ON_OFF {
	
	// myParent is a reference to the parent sketch
	PApplet p;
	
    int   time_initial = 0 ;
    boolean  state_led = false ;
    int        time_on = 1000 ; 
    int       time_off = 1000 ;

	public TemporizadorLED_ON_OFF(PApplet theParent) {
		
		p = theParent ;
		
        // MENSAJE LIBRERIA 
        System.out.println("Load Library Simon : Clase Temporizador LED / 18-nov-2022 / 0-02" );
		
	}
	
	public void drawRunTimer() {
		
		int transcurrido = p.millis() - time_initial ;
		   
		
		if( transcurrido > time_on && state_led == false ) {
			
			state_led    = true  ; 
			time_initial = p.millis(); 
			
		}else if( transcurrido > time_off && state_led == true ) {
			 
			state_led    = false  ;
			time_initial = p.millis();
		}
	
		
	}
	
	public boolean getState() {
		 
		// Invertir ( porque arriba inicia false ) 
		if( state_led == false ) {
			 return true ;
		}else {
			return false ;
		}
		
		//return state_led ;
	}

    public void set_tON_tOFF( int t_on, int t_off ) {
    	 
    	 time_on  = t_on ;
    	 time_off = t_off ;
    	 
    }
    
    
}








