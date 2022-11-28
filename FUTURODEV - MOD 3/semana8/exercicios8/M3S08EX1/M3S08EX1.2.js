/*
2 - Baixe o arquivo destructuring.js, e apenas utilizando o conceito de desestruturação
desestruture esse array trazendo o seguinte resultado:
"Chris Ahmad Antigoni Toby Sam Antony Brad"
*/

const moreStudents = [
    'Chris', 
    ['Ahmad', 'Antigoni'], 
    ['Toby', 'Sam'],
    {name: "Antony"},
    {fullname: { firstName: "Brad", secondName: "Pitt"}}
  ];
  
  // Escreva o seu código aqui
  //let student7 = moreStudents.map(fullname.firstName)
  //console.log(student7)
  let estudant7 = moreStudents.fullname.firstName
  console.log(estudant7)
  let [student1,[student2, student3],[student4, student5],{name:student6},studente7] = moreStudents
  //const [] = moreStudents;
  
  console.log(student1, student2, student3, student4, student5, student6, student7);
  
  //O valor a ser consolado deve ser o seguinte Chris Ahmad Antigoni Toby Sam Antony Brad