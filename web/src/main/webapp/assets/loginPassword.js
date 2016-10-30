function TestLoginAndPass(login,password){
    if(/\w{4,20}/.test(login) === false)
    {alert('Логин состоит из букв и цифр от 4 до 20 символов'); return false;}
    if(/.{4,20}/.test(password) === false)
    {alert('Введите пароль'); return false;}
    return true;
}

function TestLoginAndPassRegistr(login,password){
    if(/\w{4,20}/.test(login) === false)
    {alert('Логин может состоять из букв и цифр. Длинна логина от 4 до 20 символов.'); return false;}
    if(/.{4,20}/.test(password) === false)
    {alert('Пароль может состоять из любых символов. Длинна пароля от 4 до 20 символов.'); return false;}
    return true;
}