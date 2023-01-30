// First level: 1. Напишите скрипт, который считает количество секунд в часе, в сутках
{
    const secondsInHours = (hours) => (hours * 60 * 60);
    console.log(secondsInHours(24) + " seconds in 24 hours");
    console.log(secondsInHours(5) + " seconds in 5 hours");

    const secondsInDays = (days) => (days * secondsInHours(24));
    console.log(secondsInDays(3) + " seconds in 3 days");
    console.log(secondsInDays(15) + " seconds in 15 days");
}


// Создайте переменную num и присвойте ей значение 3. Выведите значение этой переменной на экран с помощью метода alert.
{
    const num = 3;
    alert(num);
}


// Создайте переменные a=10 и b=2. Выведите на экран их сумму, разность, произведение и частное (результат деления).
{
    const a = 10;
    const b = 2;
    console.log(a + " + " + b + " = " + (a + b));
    console.log(a + " - " + b + " = " + (a - b));
    console.log(a + " * " + b + " = " + (a * b));
    console.log(a + " / " + b + " = " + (a / b));
}


// Создайте переменные c=15 и d=2. Просуммируйте их, а результат присвойте переменной result. Выведите на экран значение переменной result.
{
    const c = 15;
    const d = 2;
    let result = c + d;
    console.log(result);
}


//     Создайте переменные a=10, b=2 и c=5. Выведите на экран их сумму.
{
    const a = 10;
    const b = 2;
    const c = 5;
    console.log(a + b + c);
}

//     Создайте переменные a=17 и b=10.
//     Отнимите от a переменную b и результат присвойте переменной c.
//     Затем создайте переменную d, присвойте ей значение 7.
//     Сложите переменные c и d, а результат запишите в переменную result.
//     Выведите на экран значение переменной result.
{
    const a = 17;
    const b = 10;
    const c = a - b;
    const d = 7;
    const result = c + d;
    console.log(result);
}


//     Создайте переменную str и присвойте ей значение 'Привет, Мир!'. Выведите значение этой переменной на экран.
{
    const str = "Привет, Мир!";
    console.log(str);
}



//     Создайте переменные str1='Привет, ' и str2='Мир!'. С помощью этих переменных и операции сложения строк выведите на экран фразу 'Привет, Мир!'.
{
    const str1 = "Привет, ";
    const str2 = "Мир!";
    console.log(str1 + str2);
}


//     Создайте переменную name и присвойте ей ваше имя. Выведите на экран фразу 'Привет, %Имя%!'.
{
    const name = "Сергей";
    console.log(`Привет, ${name}!`)
}


//     Создайте переменную age и присвойте ей ваш возраст. Выведите на экран 'Мне %Возраст% лет!'.
{
    const age = 37;
    console.log(`Мне ${age} лет!`)
}



// Если переменная a равна нулю, то выведите 'Верно', иначе выведите 'Неверно'. Проверьте работу скрипта при a, равном 1, 0, -3.
{
    const checkA = (a) => (a === 0 ? 'Верно' : 'Неверно');
    console.log(checkA(1));
    console.log(checkA(0));
    console.log(checkA(-3));
}


// Если переменная a больше нуля, то выведите 'Верно', иначе выведите 'Неверно'. Проверьте работу скрипта при a, равном 1, 0, -3.
{
    const checkA = (a) => (a > 0 ? 'Верно' : 'Неверно');
    console.log(checkA(1));
    console.log(checkA(0));
    console.log(checkA(-3));
}


// Если переменная a меньше нуля, то выведите 'Верно', иначе выведите 'Неверно'. Проверьте работу скрипта при a, равном 1, 0, -3.
{
    const checkA = (a) => (a < 0 ? 'Верно' : 'Неверно');
    console.log(checkA(1));
    console.log(checkA(0));
    console.log(checkA(-3));
}
