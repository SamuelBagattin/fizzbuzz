$result = [System.Text.StringBuilder]::new()
1..100 % { 
    $isMultipleOf5 = [int]$_ % 5
    $isMultipleOf3 = [int]$_ % 3
    if($isMultipleOf3 -and $isMultipleOf5){
        Write-Host "FizzBuzz"
    }elseif($isMultipleOf5){
        Write-Host "Buzz"
    }elseif($isMultipleOf3){
        Write-Host "Fizz"
    }else{
        Write-Host $_
    }
}
#Write-Host $c