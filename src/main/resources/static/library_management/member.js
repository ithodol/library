// 회원 전체 출력
const memberFindAll = async () => {
    let html = ''
    const tbody = document.querySelector('tbody')
    try{
        const get = await axios.get('/member')
        get.data.forEach(member => {
            html += `
                        <tr>
                            <td>${member.mno}</td>
                            <td>${member.mid}</td>
                            <td>${member.mname}</td>
                            <td>
                                <button class="dBtn" onclick="location.href='/library_management/memberupdate.html?mno=${member.mno}'">상세조회</button>
                            </td>
                        </tr>
                      `
        })
        tbody.innerHTML = html;
    }catch(e){console.log(e);}
}
memberFindAll();