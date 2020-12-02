window.onload = function(){
            var cont = 5;
            var box = document.getElementsByClassName("pic-show")[0];
            var con1 = document.getElementsByClassName("con1")[0];
            var con2 = document.getElementsByClassName("con2")[0];
            con2.innerHTML = con1.innerHTML;
            function scroll(){
                if(con2.offsetWidth - box.scrollLeft <= 0){
                    box.scrollLeft = 0;
                    box.scrollLeft -= con1.offsetWidth;  //此值非0 一般情况为负值 （效果和重置为0一样）
                }else{
                    box.scrollLeft += 1;
                }
            }
            var timer = setInterval(scroll,cont);
            box.onmouseover = function(e){
                clearInterval(timer);
            }
            box.onmouseout = function(e){
                timer = setInterval(scroll,cont);
            }
        }