// 도서 상세 조회
const bookFindBno = async () => {
    const bno = new URLSearchParams(location.search).get('bno')
    try{
        const r = await axios.get(`/book/view?bno=${bno}`)
        document.querySelector('.bname').value = r.data.bname
        document.querySelector('.bwriter').value = r.data.bwriter
        document.querySelector('.bpub').value = r.data.bpub
    }catch(e){console.log(e);}
}
bookFindBno();



// 도서 수정
const bookUpdate = async () => {
    const bno = new URLSearchParams(location.search).get('bno')
    const bname = document.querySelector('.bname').value
    const bwriter = document.querySelector('.bwriter').value
    const bpub = document.querySelector('.bpub').value

    const obj = {bno, bname, bwriter, bpub}
    const getData = await axios.put(`/book?bno=${bno}`, obj)
    if(getData.data == 1){
        alert('도서 수정 성공');
        location.href = '/library_management/book.html';
    }
}



