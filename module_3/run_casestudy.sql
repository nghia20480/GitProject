use case_study;
-- cau2
select ma_nhan_vien,ho_ten
from nhan_vien
where ((ho_ten like '% H%'or ho_ten like'% T%'or ho_ten like '% K%') and length(ho_ten)<=15);
-- cau3
select*
from khach_hang
where (((year(now())-year(ngay_sinh)) between 18 and 50) and (khach_hang.dia_chi like '% Quảng Trị%'or dia_chi like '% Đà Nẵng%'));
-- cau4
select khach_hang.ma_khach_hang,ho_ten,count(hop_dong.ma_khach_hang) as 'so_lan_dat_phong'
from loai_khach join khach_hang on loai_khach.ma_loai_khach=khach_hang.ma_loai_khach join hop_dong on khach_hang.ma_khach_hang=hop_dong.ma_khach_hang 
where ten_loai_khach='Diamond'
group by ma_khach_hang,ho_ten, 'so_lan_dat_phong'
order by so_lan_dat_phong
;
-- cau 5
select khach_hang.ma_khach_hang,ho_ten, ten_loai_khach, ma_hop_dong,ten_dich_vu,ngay_lam_hop_dong,ngay_ket_thuc,tong_tien 
from loai_khach join khach_hang on loai_khach.ma_loai_khach=khach_hang.ma_loai_khach join hop_dong on khach_hang.ma_khach_hang=hop_dong.ma_khach_hang join dich_vu on hop_dong.ma_dich_vu=dich_vu.ma_dich_vu join hop_dong_chi_tiet on hop_dong.ma_hop_dong=hop_dong_chi_tiet.ma_hop_dong join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem=dich_vu_di_kem.ma_dich_vu_di_kem
where tong_tien=chi_phi_thue+so_luong*gia;

-- cau 6

select hop_dong.ma_dich_vu,ten_dich_vu,dien_tich,chi_phi_thue,ten_loai_dich_vu
from hop_dong join dich_vu on hop_dong.ma_dich_vu=dich_vu.ma_dich_vu join loai_dich_vu on dich_vu.ma_loai_dich_vu=loai_dich_vu.ma_loai_dich_vu
where hop_dong.ma_dich_vu not in(select hop_dong.ma_dich_vu 
						from hop_dong join dich_vu on hop_dong.ma_dich_vu=dich_vu.ma_dich_vu
                        where ngay_lam_hop_dong between '2021-01-01' and '2021-03-31')
group by ma_dich_vu
order by ma_dich_vu
;

-- cau 7
select hop_dong.ma_dich_vu,ten_dich_vu,dien_tich,chi_phi_thue,ten_loai_dich_vu
from hop_dong join dich_vu on hop_dong.ma_dich_vu=dich_vu.ma_dich_vu join loai_dich_vu on dich_vu.ma_loai_dich_vu=loai_dich_vu.ma_loai_dich_vu 
where hop_dong.ma_dich_vu in (select hop_dong.ma_dich_vu
										from hop_dong join dich_vu on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
                                        where year(ngay_lam_hop_dong)=2020) and hop_dong.ma_dich_vu not in (select hop_dong.ma_dich_vu
										from hop_dong join dich_vu on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
                                        where year(ngay_lam_hop_dong)=2021)
group by ma_dich_vu;

select *
from hop_dong join dich_vu on hop_dong.ma_dich_vu=dich_vu.ma_dich_vu join loai_dich_vu on dich_vu.ma_loai_dich_vu=loai_dich_vu.ma_loai_dich_vu ;
-- cau9
select month(ngay_lam_hop_dong) as 'thang' , count(ma_khach_hang) as 'so_luong'
from hop_dong
group by thang
order by thang;

-- cau10
select hop_dong.ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc,count(dich_vu_di_kem.ma_dich_vu_di_kem) as'so_luong_dich_vu_di_kem'
from  hop_dong  left join dich_vu on hop_dong.ma_dich_vu=dich_vu.ma_dich_vu left join hop_dong_chi_tiet on hop_dong.ma_hop_dong=hop_dong_chi_tiet.ma_hop_dong join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem=dich_vu_di_kem.ma_dich_vu_di_kem
group by ma_hop_dong;

-- cau11
select dich_vu_di_kem.ma_dich_vu_di_kem,ten_dich_vu_di_kem
from loai_khach right join khach_hang on loai_khach.ma_loai_khach=khach_hang.ma_loai_khach join hop_dong on khach_hang.ma_khach_hang=hop_dong.ma_khach_hang join dich_vu on hop_dong.ma_dich_vu=dich_vu.ma_dich_vu join hop_dong_chi_tiet on hop_dong.ma_hop_dong=hop_dong_chi_tiet.ma_hop_dong join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem=dich_vu_di_kem.ma_dich_vu_di_kem
where ten_loai_khach='Diamond' and (dia_chi like '% Quảng Ngãi%' or dia_chi like '% Vinh%');

-- cau12
select hop_dong.ma_hop_dong,nhan_vien.ho_ten as 'ho_ten_nhan_vien',khach_hang.ho_ten as 'ho_ten_khach_hang', khach_hang.so_dien_thoai,ten_dich_vu, tien_dat_coc
from loai_khach  join khach_hang on loai_khach.ma_loai_khach=khach_hang.ma_loai_khach join hop_dong on khach_hang.ma_khach_hang=hop_dong.ma_khach_hang join dich_vu on hop_dong.ma_dich_vu=dich_vu.ma_dich_vu join hop_dong_chi_tiet on hop_dong.ma_hop_dong=hop_dong_chi_tiet.ma_hop_dong join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem=dich_vu_di_kem.ma_dich_vu_di_kem join nhan_vien on hop_dong.ma_nhan_vien=nhan_vien.ma_nhan_vien
where hop_dong.ma_hop_dong in(select hop_dong.ma_hop_dong
										from hop_dong
                                        where ngay_lam_hop_dong between '2020-10-01' and '2020-12-31') and hop_dong.ma_hop_dong not in (select hop_dong.ma_hop_dong
										from hop_dong
                                        where ngay_lam_hop_dong between '2021-01-01' and '2021-6-31');

select *
from loai_khach  join khach_hang on loai_khach.ma_loai_khach=khach_hang.ma_loai_khach join hop_dong on khach_hang.ma_khach_hang=hop_dong.ma_khach_hang join dich_vu on hop_dong.ma_dich_vu=dich_vu.ma_dich_vu join hop_dong_chi_tiet on hop_dong.ma_hop_dong=hop_dong_chi_tiet.ma_hop_dong join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem=dich_vu_di_kem.ma_dich_vu_di_kem join nhan_vien on hop_dong.ma_nhan_vien=nhan_vien.ma_nhan_vien
;
-- cau13
create temporary table dich_vu_di_kem1
select ten_dich_vu_di_kem,sum(so_luong) as 'tong_so_luong'
from loai_khach  join khach_hang on loai_khach.ma_loai_khach=khach_hang.ma_loai_khach join hop_dong on khach_hang.ma_khach_hang=hop_dong.ma_khach_hang join dich_vu on hop_dong.ma_dich_vu=dich_vu.ma_dich_vu join hop_dong_chi_tiet on hop_dong.ma_hop_dong=hop_dong_chi_tiet.ma_hop_dong join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem=dich_vu_di_kem.ma_dich_vu_di_kem join nhan_vien on hop_dong.ma_nhan_vien=nhan_vien.ma_nhan_vien
group by ten_dich_vu_di_kem,'tong_so_luong'
;

select* from dich_vu_di_kem1;
 create temporary table max_so_lan_su_dung
 select max(dich_vu_di_kem1.tong_so_luong) as 'max'
from dich_vu_di_kem1;
select*from max_so_lan_su_dung;
select*
from dich_vu_di_kem1 join max_so_lan_su_dung on dich_vu_di_kem1.tong_so_luong=max_so_lan_su_dung.max;
-- cau14
select ten_dich_vu_di_kem, count(hop_dong_chi_tiet.ma_dich_vu_di_kem) as 'so_lan_su_dung',ma_hop_dong
from hop_dong_chi_tiet join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem=dich_vu_di_kem.ma_dich_vu_di_kem
group by ten_dich_vu_di_kem,'so_lan_su_dung',ma_hop_dong
having count(hop_dong_chi_tiet.ma_dich_vu_di_kem) =1;
-- cau15
select ho_ten,nhan_vien.ma_nhan_vien, count(hop_dong.ma_hop_dong) as 'so_lan_ky_hop_dong'
from vi_tri join nhan_vien on vi_tri.ma_vi_tri=nhan_vien.ma_vi_tri join trinh_do on trinh_do.ma_trinh_do = nhan_vien.ma_trinh_do join hop_dong on nhan_vien.ma_nhan_vien= hop_dong.ma_nhan_vien
where year(hop_dong.ngay_lam_hop_dong) between '2020' and '2021'
group by ho_ten,'so_lan_ky_hop_dong',nhan_vien.ma_nhan_vien
having count(hop_dong.ma_hop_dong)<=3 ;
-- cau16
delete from nhan_vien where not exists (select nhan_vien.ma_nhan_vien from hop_dong
									where hop_dong.ngay_lam_hop_dong between '2019-01-01' and '2020-31-01' and hop_dong.ma_nhan_vien=nhan_vien.ma_nhan_vien );
                                    
                                   