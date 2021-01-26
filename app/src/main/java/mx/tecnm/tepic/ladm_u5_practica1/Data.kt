package mx.tecnm.tepic.ladm_u5_practica1

import com.google.firebase.firestore.GeoPoint

class Data {
    var nombre : String = ""
    var P1 : GeoPoint= GeoPoint(0.0,0.0)
    var P2 : GeoPoint=GeoPoint(0.0,0.0)
    override fun toString(): String {
        return nombre+"\n"+P1.latitude+","+P1.longitude+"\n"+
                P2.latitude+","+P2.longitude
    }
    fun estoyEn(posicionActual:GeoPoint):Boolean{
        if (posicionActual.latitude>=P1.latitude &&
                posicionActual.longitude<=P2.latitude){
            if(invertir(posicionActual.longitude)>=invertir(P1.longitude) &&
                    invertir(posicionActual.longitude)<=invertir(P2.longitude)){
                return true
            }
        }
        return false
    }
    private fun invertir(valor:Double):Double{
        return valor*-1
    }
}