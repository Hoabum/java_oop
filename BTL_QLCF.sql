use [BTL_QLCF] 
go

create table NhanVien(
      [MaNV] [varchar](5),
      [Name] [varchar](50),
	  [Tuoi] [int],
	  [sdt] [int],
	  [DiaChi] [nvarchar](100),
	  [Tinhluong] [nvarchar](50),
	  [MucLuong] [float]
	 
	  )
INSERT INTO NhanVien
           ([MaNV]
		   ,[Name]
		   ,[Tuoi]
		   ,[sdt]
		   ,[DiaChi]
		   ,[TinhLuong]
		   ,[MucLuong]
		   ,[NgayVaoLam])
VALUES ( 
		)
GO