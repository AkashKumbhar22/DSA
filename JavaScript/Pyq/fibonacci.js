<script>
    let a = 0;
    let b = 1;
    let next ;

    alert(a);
    alert(b);
    
    for(let i=1;i<=10;i++){
        
        next = a + b;
        alert(next);

        a = b;
        b = next;        
    }

</script>