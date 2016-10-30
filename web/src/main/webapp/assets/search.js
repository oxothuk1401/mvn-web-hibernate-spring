function TestSearch(searching){
    if(/.{1,}/.test(searching) === false)
    {alert('Введите критерый для поиска'); return false;}
    return true;
}