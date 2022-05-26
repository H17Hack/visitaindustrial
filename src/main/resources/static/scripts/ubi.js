function Obtener(){
    var div= document.getElementById("divInfo");
    if(navigator.geolocation){
        /*div.append*/alert(" El dispositivo soporta la Geolocalización.");
        navigator.geolocation.getCurrentPosition(CargarDatos);
    }
    else{
        /*div.append*/ alert("El dispositivo no soporta la geolocalización.");
    }
}

function CargarDatos(pos){
    var div = document.getElementById("divInfo");
    var parr= document.createElement("p");
    /*parr.innerText=*/alert( "La ubicación actual es: "+ 
    pos.coords.latitude + ", " + pos.coords.longitude);
    /*parr.innerText="La altitud es: "+ 
    pos.coords.altitude;*/
    //div.append(parr);

    var mapa = new Microsoft.Maps.Map("#mapas", {
    center: new Microsoft.Maps.Location(pos.coords.latitude, pos.coords.longitude),
    zoom: 14,
    mapTypeId: Microsoft.Maps.MapTypeId.aerial
    });
    var marcador =new Microsoft.Maps.Pushpin( new Microsoft.Maps.Location(pos.coords.latitude, pos.coords.longitude),
{
    title: "Usted esta aqui",
    subTitle: pos.coords.latitude +", "+ pos.coords.longitude,
    text:"*"
});
mapa.entities.push(marcador);
mapa.setView({center: new Microsoft.Maps.Location(pos.coords.latitude, pos.coords.longitude),
zoom: 25 });
}