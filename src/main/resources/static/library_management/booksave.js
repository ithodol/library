// 도서 등록
const bookSave = () => {
    const bname = document.querySelector('.bname').value;
    const bwriter = document.querySelector('.bwriter').value;
    const bpub = document.querySelector('.bpub').value;

    const obj = {bname, bwriter, bpub}
    axios.post('/book', obj)
        .then(r => {
            alert('도서 등록 성공');
            location.href = '/library_management/book.html';
        })
        .catch(e => {console.log(e);})
}