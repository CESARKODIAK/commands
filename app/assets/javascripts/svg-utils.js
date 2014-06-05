var $=function (id){document.getElementById(id)}

function tee(){
//    alert("hoo")



    //      ​
    //
    //      var svg = document.getElementById("svg");
    //      var r = rect(100, 100, "blue");
    //      add(r);
    //      animate(r); of
}
var rect=function(h,w,fill){
 var NS="http://www.w3.org/2000/svg";
 var SVGObj= document.createElementNS(NS,"rect");
 SVGObj.width.baseVal.value=w;
 SVGObj.height.baseVal.value=h;
 SVGObj.setAttribute("height",h);
 SVGObj.style.fill=fill;
 return SVGObj;
}
var rectangle=rect


var animate=function(obj){
setInterval("animate_step("+obj+")",100);
}

var animate_step=function(obj){
 obj.x.baseVal.value+=1;
 obj.y.baseVal.value+=1;
}

function add(obj){
svg.appendChild(obj);
}


var blinks=function (number,hide) {
//    number=number||0;
//    hide=hide||1;
    number--;
    if(number==0)return;
    if(hide==1) {
        $('.blink').show();
        hide = 0;
    }
    else {
        $('.blink').hide();
        hide = 1;
    }
    setTimeout("blinks("+number+","+hide+")",600);
}

window.onload =(function() {
//    document.getElementById('text').keydown(specialKeys);
    blinks(4, 1);
});
