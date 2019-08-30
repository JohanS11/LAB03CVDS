package edu.eci.cvds.tdd.registry;

public class Registry {
    public RegisterResult registerVoter(Person p) {
    	RegisterResult resultado = null;
    	
        if (!p.isAlive()) {
        	resultado = RegisterResult.DEAD;
        } else if (p.getAge()<=0) {
        	resultado = RegisterResult.INVALID_AGE;
        } else if(p.getAge()<18) {
        	resultado = RegisterResult.UNDERAGE;
        } else if (p.getGender()==Gender.UNIDENTIFIED) {
        	resultado = RegisterResult.UNIDENTIFIEDGENDER;
        } else {
        	resultado = RegisterResult.VALID;
        }
        return resultado;
    }
}