// 도서 삭제
const bookDelete = async () => {
    const bno = new URLSearchParams(location.search).get('bno');

    const getData = await axios.delete(`/book?bno=${bno}`);
    if(getData.data == 1){
        alert('도서 삭제 완료');
        location.href = '/library_management/book.html';
    }
}