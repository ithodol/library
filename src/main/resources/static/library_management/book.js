// 도서 전체 조회
const bookFindAll = async () => {
try{
    const r = await axios.get('/book')
    const tbody = document.querySelector('tbody')
    let html = ''
        r.data.forEach(book => {
            html += `
                    <tr>
                        <td>${book.bno}</td>
                        <td>${book.bname}</td>
                        <td>${book.bwriter}</td>
                        <td>${book.bpub}</td>
                        <td>
                            <button class="dBtn" onclick="location.href='/library_management/bookupdate.html?bno=${book.bno}'">상세조회</button>
                        </td>
                    </tr>
                    `
        })
        tbody.innerHTML = html;
    }catch(e) {console.log(e);}
}

bookFindAll();